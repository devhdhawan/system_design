package DSA.GraphImplementation;

// Disjoint Set (Union-Find) data structure implementation
// This implementation supports path compression and union by rank.
// Time Complexity: O(α(n)) for find and union operations, where α is the inverse Ackermann function
// Space Complexity: O(n) where n is the number of elements

public class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i; // Each element is its own parent initially
            rank[i] = 0;   // Initial rank is 0
        }
    }

    public int find(int x){
        int root = parent[x];

        if(root!=x){
            parent[x] = find(root);
            return parent[x];
        }
        return root;
    }

    public void union(int x,int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX!=rootY){
            // Union by rank
            if(rank[rootX] < rank[rootY]){
                // Make rootY the parent of rootX
                parent[rootX] = rootY;
            } else if(rank[rootX] > rank[rootY]){
                // Make rootX the parent of rootY
                parent[rootY] = rootX;
            } else {
                // If ranks are the same, make one root the parent of the other and increase its rank
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
    public static void main(String[] args) {
        // Example usage of Disjoint Set
        DisjointSet ds = new DisjointSet(5);
        ds.union(0, 1);
        ds.union(1, 2);
        ds.union(3, 4);

        System.out.println("Find 0: " + ds.find(0)); // Should print the root of the set containing 0
        System.out.println("Find 1: " + ds.find(1)); // Should print the root of the set containing 1
        System.out.println("Find 2: " + ds.find(2)); // Should print the root of the set containing 2
        System.out.println("Find 3: " + ds.find(3)); // Should print the root of the set containing 3
        System.out.println("Find 4: " + ds.find(4)); // Should print the root of the set containing 4
    }
}
