## Simplest Database
The Simplest Database and Its Limitations: The chapter begins by illustrating the "world's simplest database" where data is stored by simply appending key-value pairs to a file, much like a log. While appending to a file is highly efficient, this method leads to terrible performance for reading data because every lookup requires scanning the entire file from beginning to end. This is an O(n) operation, meaning lookup time increases linearly with the number of records

## Need for Indexes
 To overcome the inefficiency of scanning the entire database for every read, an index is required. An index is described as an additional data structure that acts as a "signpost" to help locate the desired data efficiently.
 In order to efficiently find the value for a particular key in the database, we need a different data structure: an index. In this chapter we will look at a range of indexing structures and see how they compare; the general idea behind them is to keep some additional metadata on the side, which acts as a signpost and helps you to locate the data you want. If you want to search the same data in several different ways, you may need several different indexes on different parts of the data.

## Hash Maps
The simplest indexing strategy involves keeping an in-memory hash map. This hash map maps each key to a byte offset in the data file on disk, which indicates the location where the corresponding value can be found

Whenever a new key-value pair is written to the file (either an insertion or an update to an existing key), the in-memory hash map is updated to store the offset of the newly written data.

**Use Cases (Bitcask Example):** A storage engine like Bitcask (the default in Riak) essentially uses this method. It is well-suited for workloads where the value for each key is updated frequently, such as incrementing a counter for a cat video's play count. In such scenarios, there are many writes, but the number of distinct keys is manageable enough to keep them all in memory

### <u>Addressing Issues in Real Implementations (Log-Structured Storage):</u>

**Log Recovery:** In order to avoid log files to grow indefinitely, it divides the files into segment, when the segment grow till certain size or age it will be frozen.

**Compaction and Merging:** A background thread periodically merges and compacts these older, frozen segments.

 **Deleting Records:** To delete a key, a special deletion record (a tombstone) is appended to the data file. During compaction, this tombstone signals the merging process to discard any previous values for that key.

**Crash Recovery:** If the database crashes, the in-memory hash maps are lost. While they can be restored by scanning segment files, this can be slow for large files. To speed up recovery, systems like Bitcask store a snapshot of each segment's hash map on disk for quicker loading.

**Partially Written Records:** Checksums are used to detect and ignore corrupted or partially written records if a crash occurs during a write.

**Concurrency Control:** Since writes are appended sequentially, a common design is to have a single writer thread. However, append-only and immutable data file segments allow for concurrent reads by multiple threads.

### <u>Limitations of Hash Indexes:</u>
**Memory Footprint:** The entire hash table must fit in memory. This makes it unsuitable for datasets with a very large number of distinct keys. 

**Inefficient Range Queries:** Hash indexes do not support efficient range queries. 

## LSM Trees and SSTables
LSM Tree uses a combination of in-memory and on-disk storage, writing data sequentially in batches and compacting it later, making it well-suited for systems with heavy write loads that also need efficient reads.

### <u>Key features of an LSM Tree include:</u>
1. It consists of multiple components or levels, typically with a small, in-memory component and one or more larger, disk-based components.
2. Incoming writes are first recorded in a fast, in-memory structure called a memtable.
3. When the memtable fills up, it is flushed to disk as an immutable file called an SSTable (Sorted String Table).
4. Over time, SSTables are merged and compacted in the background to maintain efficiency and reduce fragmentation.
5. Writes are optimized for sequential, batched disk operations, which improves write throughput and reduces costly random disk writes.

### <u>Performance Optimization</u>
Reads check the memtable first and then search through SSTables, often using bloom filters (Bloom filters are often used to quickly check if a key might be in a data file (like an SSTable) to avoid expensive disk lookups when the key is definitely absent) to avoid unnecessary disk reads.


### <u>Crash Recovery</u>
1. Data are first recorded in a special file called a write-ahead log (WAL).
2. This write-ahead log is an append-only log file that records every incoming write in the order they arrive. The purpose of this log is to ensure durability, meaning that even if the system crashes unexpectedly (e.g., power failure or hardware failure), no committed writes will be lost. When the system restarts, it can replay this log to recover all recent writes that had not yet been flushed to the more permanent storage structures like SSTables on disk.
3. After that data written to in memory (we called it as memtable, memory balanced table), and then the data flushed to disk as SSTables.








