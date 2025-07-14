class Solution {
public:
    map<int,vector<int>> mp;
    char arr[9]={'1','2','3','4','5','6','7','8','9'};
    
    bool validateBoard(vector<vector<char>>& board,int row,int column,int value){
        for(int i=0;i<9;i++){
            if(value==board[row][i])
                return false;
        }

        for(int i=0;i<9;i++){
            if(value==board[i][column])
                return false;
        }

        int rtmp=row/3;
        int ctmp=column/3;

        rtmp=rtmp*3;
        ctmp=ctmp*3;

        for(int i=rtmp;i<3+rtmp;i++){
            for(int j=ctmp;j<3+ctmp;j++){
                if(value==board[i][j])
                    return false;
            }
        }
        return true;
    }

    bool Sudoku(vector<vector<char>>&board){
        for(int i=0;i<board.size();i++){
            for(int j=0;j<board[i].size();j++){
                if(board[i][j]=='.'){
                    for(int k=0;k<9;k++){
                        if(validateBoard(board,i,j,arr[k]))
                        {
                            board[i][j]=arr[k];

                            if(Sudoku(board))
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    void solveSudoku(vector<vector<char>>& board) {
        Sudoku(board);
        
    }
};