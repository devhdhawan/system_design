class Solution {
    public void addEdge(ArrayList<ArrayList<Integer>> adj,int s,int e){
        adj.get(e).add(s);
    }

    
    public boolean topologicalSort(ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree=new int[adj.size()];

        for(int i=0;i<adj.size();i++){
            for( var n : adj.get(i)){
                indegree[n]++;
            }
        }

        // Add All the node with indegree 0 to the queue
        for(int i=0;i<adj.size();i++){
            if(indegree[i]==0)
                queue.add(i);
        }

        int cnt=0;
        while(!queue.isEmpty()){
            int node = queue.poll();

            for(int n:adj.get(node)){
                --indegree[n];
                if(indegree[n]==0)
                    queue.add(n);
            }
            cnt++;
        }

        if(adj.size()==cnt) // if cnt is equal to the number of vertices it means no cycle
            return false;
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i=0;i<numCourses;i++){
                adj.add(new ArrayList<Integer>());
            }
            
            // Add Edge
            for(int i=0;i<prerequisites.length;i++){
                addEdge(adj,prerequisites[i][1],prerequisites[i][0]);
            }

            if(topologicalSort(adj)==true)
                return false;
            return true;

    }
}