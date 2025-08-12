class Solution {
    public void solve(char[][] grid,int i,int j,boolean[][] visited,int r,int c){
        if(i<0 || j<0)
            return ;
        if(i>=r || j>=c)
            return ;
        if(visited[i][j]==true)
            return ;
        if(grid[i][j]=='0')
            return;
        visited[i][j]=true;

        solve(grid,i+1,j,visited,r,c);
        solve(grid,i,j+1,visited,r,c);
        solve(grid,i-1,j,visited,r,c);
        solve(grid,i,j-1,visited,r,c);
    }
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] visited = new boolean[r][c];
        int ans=0;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    solve(grid,i,j,visited,r,c);
                    ans++;
                }
            }
        }
        return ans;
        
    }
}