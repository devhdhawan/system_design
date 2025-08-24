package DSA.GraphImplementation;


class AdjacencyMatrix {

    private int[][] adjMatrix;
    private int numVertices;
    
    AdjacencyMatrix(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }
    
    public void addEdge(int i,int j){
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }
    
    public void dfsUtil(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");
        
        for(int i=0;i<numVertices;i++){
            if(adjMatrix[start][i] == 1 && !visited[i]){
                dfsUtil(i, visited);
            }
        }
    }
    public void dfs(){
        boolean[] visited = new boolean[this.numVertices];

        for(int i=0;i<this.numVertices;i++){
            if(!visited[i]){
                dfsUtil(i, visited);
            }
        }
    }

    public void display(){
        // System.out.println("Display",this.numVertices);
        for(int i=0;i<this.numVertices;i++){
            for(int j=0;j<this.numVertices;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        AdjacencyMatrix g = new AdjacencyMatrix(5);
        
        g.addEdge(0,0);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,1);
        g.addEdge(2,2);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.addEdge(4,3);
        
        g.display();
        g.dfs();
    }
}