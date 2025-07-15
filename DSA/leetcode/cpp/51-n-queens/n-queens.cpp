class Solution {
public:
    vector<vector<string>> ans;

    bool isValid(vector<string>& board,int n,int row,int col){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q' and row!=i)
                return false;
        }

        for(int i=0;i<n;i++){
            if(board[row][i]=='Q' and col!=i)
                return false;
        }

        int i=row;
        int j=col;

        while(i<n and j<n){
            if(board[i][j]=='Q' and row!=i and col!=j)
                return false;

            i++;
            j++;
        }
        
        i=row;
        j=col;
        while(i>=0 and j<n){
            if(board[i][j]=='Q' and row!=i and col!=j)
                return false;
            i--;
            j++;
        }

        i=row;
        j=col;
        while(i<n and j>=0){
            if(board[i][j]=='Q' and row!=i and col!=j)
                return false;
            i++;
            j--;
        }
        
        i=row;
        j=col;
        while(i>=0 and j>=0){
            if(board[i][j]=='Q' and row!=i and col!=j)
                return false;
            i--;
            j--;
        }
        return true;
    }
    void display(vector<string>& board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cout<<board[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    bool nQueen(vector<string>& board,int n,int row){
        if(row>=n)
            return true;
      
        for(int i=0;i<n;i++){
            
            if(board[row][i]=='.')
            {
                board[row][i]='Q';
               
                if(isValid(board,n,row,i)){
                    if(nQueen(board,n,row+1)){
                        if(row==n-1)
                            ans.push_back(board);
                    }

                }
                board[row][i]='.';    

            }
        }
        return false;
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<string> board;

        for(int i=0;i<n;i++){
            string st;
            for(int j=0;j<n;j++){
                st=st+".";
            }
            board.push_back(st);
        }
        
        nQueen(board,n,0);

        return ans;

    }
};