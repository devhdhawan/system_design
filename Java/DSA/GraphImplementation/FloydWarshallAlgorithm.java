package DSA.GraphImplementation;

// Floyd-Warshall Algorithm for finding shortest paths between all pairs of vertices
// This implementation can also detect negative cycles in the graph.
// Time Complexity: O(V^3) where V is the number of vertices

public class FloydWarshallAlgorithm {
    private static int INF = 100000000; // A large value representing infinity
    public static void floydWarshall(int[][] dist, int numberOfVertices) {
        // Applying Floyd-Warshall algorithm to find shortest paths between all pairs of vertices
        for (int k = 0; k < numberOfVertices; k++) {
            for (int i = 0; i < numberOfVertices; i++) {
                for (int j = 0; j < numberOfVertices; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        // Find negative cycles
        for (int i = 0; i < numberOfVertices; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Negative cycle detected involving vertex: " + i);
                return ;
            }
        }
        // Print the shortest distance matrix
        System.out.println("Shortest distance matrix:");
        for (int i = 0; i < numberOfVertices; i++) {
            for (int j = 0; j < numberOfVertices; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       
        // int[][] dist = {
        //     {0, 5, INF, 10},
        //     {INF, 0, 3, INF},
        //     {INF, INF, 0, 1},
        //     {INF, INF, INF, 0}
        // };

        // Graph for Negative Cycle Detection
        int[][] dist={ {0, 1, INF, INF},
                          {INF, 0, -1, INF},
                          {INF, INF, 0, -1},
                          {-1, INF, INF, 0}};

        int numberOfVertices = dist.length;
        floydWarshall(dist, numberOfVertices);
    }
}
