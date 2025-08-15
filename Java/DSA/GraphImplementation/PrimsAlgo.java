package DSA.GraphImplementation;
import java.util.ArrayList;
import java.util.PriorityQueue;

// Prim's Algorithm for finding Minimum Spanning Tree (MST) in a graph
// This implementation uses a priority queue to efficiently select the minimum weight edge.
// Time Complexity: O(E log V) where E is the number of edges and V is the number of vertices

class Pair implements Comparable<Pair> {
    int vertex;
    int weight;

    Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public int compareTo(Pair other) {
        return Integer.compare(this.weight, other.weight);
    }
}
public class PrimsAlgo {

    public static int primsMST(int[][] edges, int numberOfVertices) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < numberOfVertices; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            adj.get(u).add(new Pair(v, weight));
            adj.get(v).add(new Pair(u, weight)); // For undirected graph
        }

        boolean[] inMST = new boolean[numberOfVertices];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0)); // Start from vertex 0 with weight 0
        int mstWeight = 0;

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;
            int weight = current.weight;

            if (inMST[u]) continue; // Skip if already included in MST
            inMST[u] = true; // Include vertex in MST
            mstWeight += weight; // Add weight to total MST weight

            System.out.println("Included edge with weight: " + weight + " to vertex: " + u);

            for (Pair neighbor : adj.get(u)) {
                if (!inMST[neighbor.vertex]) {
                    pq.add(new Pair(neighbor.vertex, neighbor.weight));
                }
            }
            
        }
        System.out.println("Total weight of Minimum Spanning Tree: " + mstWeight);
        return mstWeight; // Return total weight of the MST
        
    }
    public static void main(String[] args) {
        // Example usage of Prim's algorithm
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };
        int numberOfVertices = 4;
        primsMST(edges, numberOfVertices);
    }
}
