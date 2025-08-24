package DSA.GraphImplementation;

import java.util.*;
//Topological Sort Using DFS 
class TopologicalSortBFS{

    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int s,int d){
                adj.get(s).add(d);
    }

    
    
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //Number of Vertices
        int V=4;
        //Initialize the list
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        //Add Edge
        // int[][] edges = {{5,0},{4,0},{5,2},{2,3},{3,1},{4,1}};
        int[][] edges = {{2,3},{3,1},{1,2}};
        
        for(int i=0;i<edges.length;i++){
            addEdge(adj,edges[i][0],edges[i][1]);
        }

        ArrayList<Integer> ans = dfs(adj);

        System.out.println(ans);
    }
}