# Binary Search Tree (BST)

## Overview

A **Binary Search Tree (BST)** is a fundamental data structure in computer science used to store and manage ordered data efficiently. In a BST:
- Each node contains a unique key.
- All keys in the left subtree of a node are **less than** the node’s key.
- All keys in the right subtree are **greater than** the node’s key.

BSTs are commonly used for searching, inserting, and deleting values quickly when the tree remains balanced.

## Features

This project implements a BST with the following operations:
- **Insertion**: Add a new key to the tree.
- **Search**: Check if a key exists in the tree.
- **Delete**: Remove a key from the tree.
- **Update**: Change the associated value of a key (if supported in your implementation).

## Time Complexity

The efficiency of BST operations depends on the *height* of the tree.

| Operation | Best/Average Case | Worst Case      |
|-----------|------------------|----------------|
| Insert    | O(log n)         | O(n)           |
| Search    | O(log n)         | O(n)           |
| Delete    | O(log n)         | O(n)           |

- If the BST is **balanced**, operations are fast: **O(log n)**.
- If the BST is **unbalanced** (degenerates into a linked list), operations degrade to **O(n)**.
- **Self-balancing** BSTs, such as AVL or Red-Black Trees, always maintain **O(log n)** time complexity for operations.

> **Note:**  
> If you want to *update the key* of a node, you should delete the existing node and insert the new one to preserve the BST properties.  
> Updating only the associated data of a node (not the key) is a direct operation and does not affect the tree structure.


