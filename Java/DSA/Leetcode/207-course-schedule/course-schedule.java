class Solution {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int s,int d){
            // adj.get(s).add(d);
            adj.get(d).add(s);
    }

    public static boolean dfsRec(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int s,boolean[] pathVis){
        if(visited[s]==true && pathVis[s]==true)
            return true;

        visited[s]=true;
        pathVis[s]=true;

        for(var dist:adj.get(s)){
           
                if(!visited[dist]){
                    if(dfsRec(adj,visited,dist,pathVis))
                        return true;
                 }else{
                    if(pathVis[dist]==true)
                        return true;
                 }
        }
        pathVis[s]=false;
        return false;
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];
        boolean[] pathVis = new boolean[adj.size()];


        for(int i=0;i<adj.size();i++){
            if(!visited[i]){
                if(dfsRec(adj,visited,i,pathVis))
                    return true;
            }
    
        }
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            
            addEdge(adj,prerequisites[i][0],prerequisites[i][1]);
        }

        boolean status = dfs(adj);
        if(status==true)
            return false;
        return status==false;

    }
}