# Disjoint Set (Union-Find) – Naive Implementation

## Overview
- **Purpose:** Efficiently handles dynamic connectivity (finding and merging sets).
- **Uses:** Kruskal's MST, network connectivity, cycle detection, clustering.

## Data Structure
- **Naive Approach:** Each element points to its parent. No path compression, no union by rank.

## Operations

### Find(x)
- Traverse parent pointers from x to root.
- **Time Complexity:** O(n) worst-case (if tree is a linear chain).

### Union(x, y)
- Make root of one tree point to root of another.
- **Time Complexity:** O(n) worst-case (can cause deep trees).

---

## Why O(n) Complexity?
- The tree becomes a long chain if always joining root to leaf without balancing.
- The depth can grow up to n (size of set), making find/union take up to O(n) time.


