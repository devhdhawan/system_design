package DSA.GraphImplementation;

import java.util.*;
//Topological Sort Using DFS 
class TopologicalSortGraph{
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int s,int d){
                adj.get(s).add(d);
    }

    public static void TopologicalSort(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int s,Stack<Integer> st){
            visited[s]=true;
            st.push(s);

            for(var dist:adj.get(s)){
                if(!visited[dist]){
                    TopologicalSort(adj,visited,dist,st);
                }
            }
    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                TopologicalSort(adj,visited,i,st);
            }

        }

    
        while(!st.isEmpty()){
            Integer val=st.pop();

            ans.add(val);
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //Number of Vertices
        int V=2;
        //Initialize the list
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        //Add Edge
        // int[][] edges = {{5,0},{4,0},{5,2},{2,3},{3,1},{4,1}};
        // int[][] edges = {{2,3},{3,1},{1,2}};
        int[][] edges = {{0,1},{1,0}};
        
        for(int i=0;i<edges.length;i++){
            addEdge(adj,edges[i][0],edges[i][1]);
        }

        ArrayList<Integer> ans = dfs(adj);

        System.out.println(ans);
    }
}