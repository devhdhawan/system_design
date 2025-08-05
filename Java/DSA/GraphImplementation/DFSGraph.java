package DSA.GraphImplementation;

import java.util.*;

public class DFSGraph {
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer> > adj){
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<Integer>();

        dfsRec(adj,visited,0,res);
        
        return res;
    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, ArrayList<Integer> res) {
        
            visited[s] = true;
            res.add(s);

            for(int dist:adj.get(s)){
                if(!visited[dist]){
                    dfsRec(adj,visited,dist,res);
                }
            }
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int source,int dist){
            adj.get(source).add(dist);
            adj.get(dist).add(source);
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V=5;
        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[][] edges= { { 1, 2 },{ 1, 0 },{ 2, 0 },{ 2, 3 },{ 2, 4 } }; 
        for (int[] e : edges)
        {
            addEdge(adj, e[0], e[1]);
        }

        // Perform DFS starting from vertex 0
        ArrayList<Integer> res = dfs(adj);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
