package DSA.GraphImplementation;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

// BFS (Breadth-First Search) Graph Implementation
// This implementation uses an adjacency list to represent the graph.
// Time Complexity: O(V + E) where V is the number of vertices and E is the number of edges

public class BFSGraph {
        public static void addEdges(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
            adj.get(source).add(dest);
            adj.get(dest).add(source); // For undirected graph
        }  

        public static void bfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int start){
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited[start] = true; // Mark the starting vertex as visited
            while(!queue.isEmpty()){
                int vertex = queue.poll();
                visited[vertex] = true;
                System.out.print(vertex+" ");

                // Traverse all the adjacent vertices
                for(int neighbor : adj.get(vertex)) {
                    if (!visited[neighbor]) {
                        queue.add(neighbor);
                        visited[neighbor] = true; // Mark as visited
                    }
                }
            }
        }
        public static void main(String[] args) {
        // Example graph represented as an adjacency list
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 2}, {1, 3}, {2, 4}
        };

        int V = 5; // Number of vertices
        boolean[] visited = new boolean[V];

        // Create an adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            addEdges(adj, edge[0], edge[1]);
        }

        // Perform BFS starting from vertex 0
        bfs(adj, visited, 0);
    }
}
