# Dijkstra's Algorithm

## Overview
- **Purpose:** Finds shortest paths from a source node to all other nodes in a weighted graph (no negative weights).
- **Complexity:** O((V+E)logV) with priority queue (heap); V = nodes, E = edges.
- **Main Data Structure:** Min-heap or priority queue.

## Key Concepts
- Greedy algorithm: always picks node with smallest tentative distance.
- Works only for non-negative edge weights.
- Often used in routing and navigation problems.

## Basic Steps
1. Initialize all distances to infinity except the source (set to 0).
2. Add source node to priority queue.
3. While queue is not empty:
   - Pop node with smallest distance.
   - For each neighbor:
     - If found a shorter path, update distance and push neighbor into queue.

## Pseudocode

