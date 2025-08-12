class Pair{
    public int first;
    public int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }


}
class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        int[] color = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            color[i]=-1;
        }
        Queue<Pair> queue = new LinkedList<>();

    for(int i=0;i<graph.length;i++){
        if(!visited[i]){
            queue.add(new Pair(i,1));

        while(!queue.isEmpty()){
            Pair front = queue.poll();

            visited[front.first] = true;
            color[front.first]=front.second;

            for(int v:graph[front.first]){
                if(!visited[v]){
                    if(front.second==0)
                        queue.add(new Pair(v,1));
                    else
                        queue.add(new Pair(v,0));
                }else{
                    if(color[v]==front.second)
                        return false;
                    
                }
            }
        }
        }
    }
        return true;
    }
}