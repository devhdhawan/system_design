package DSA.GraphImplementation;
import java.util.Arrays;
import java.util.Comparator;

// Kruskal's Algorithm for finding Minimum Spanning Tree (MST) in a graph
// This implementation uses a Disjoint Set (Union-Find) data structure to manage connected components
// and efficiently check for cycles.
// Time Complexity: O(E log E) where E is the number of edges
// Space Complexity: O(V) where V is the number of vertices

public class krushkalsAlgo {
    private int[] parent;
    private int[] rank;
    private int numVertices;

    public krushkalsAlgo(int size) {
        parent = new int[size];
        rank = new int[size];
        numVertices = size;
        for (int i = 0; i < numVertices; i++) {
            parent[i] = i; // Each element is its own parent initially
            rank[i] = 0;   // Initial rank is 0
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            // Union by rank
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public void kruskalMST(int[][] edges) {
        // Sort edges based on weight
        Arrays.sort(edges,Comparator.comparingInt(edge -> edge[2]));

        int mstWeight = 0;
        System.out.println("Edges in the Minimum Spanning Tree:");
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (find(u) != find(v)) {
                union(u, v);
                mstWeight += weight;
                System.out.println("Edge: " + u + " - " + v + " with weight: " + weight);
            }
        }
        System.out.println("Total weight of MST: " + mstWeight);
    }

    public static void main(String[] args) {
        // Example usage of Kruskal's Algorithm
        krushkalsAlgo kruskal = new krushkalsAlgo(5);
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };

        kruskal.kruskalMST(edges);
    }
}
