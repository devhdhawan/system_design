class Solution {
    public boolean dfs(int s,int c,int[] color,int[][] graph,boolean[] visited){
            visited[s] = true;
            color[s]=c;
            boolean status = true;
            for(int node:graph[s]){
                if(!visited[node]){
                    if(c==1)
                        status=dfs(node,0,color,graph,visited);
                    else
                        status=dfs(node,1,color,graph,visited);
                }else{
                    if(color[node]==c)
                        return false;
                }

                if(status == false)
                    return false;
            }
        return status;
    }
    public boolean isBipartite(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        int[] color = new int[graph.length];

        for(int i=0;i<graph.length;i++){
            color[i]=-1;
        }

        boolean status = false;
        for(int i=0;i<graph.length;i++){
            if(!visited[i])
                status=dfs(i,1,color,graph,visited);
            if(status == false)
                return status;
        }
        return status;
        
    }
}