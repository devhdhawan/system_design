package SystemDesign.LowLevelDesign.SnakeLadder;


import java.util.HashMap;
import java.util.Map;

class SnakeLadder{
    int row;
    int col;
    String endBoardNumber;
    boolean isSnake;
    boolean isLadder;

    SnakeLadder(int row,int col,String endBoardNumber,boolean isSnake,boolean isLadder){
        this.row=row;
        this.col=col;
        this.isSnake=isSnake;
        this.isLadder=isLadder;
        this.endBoardNumber=endBoardNumber;
    }
}
public class Board {
    
    String[][] board;
    Map<String,SnakeLadder> boardMap = new HashMap<>();
    Integer size;
    Snake snakeObj;
    Ladder ladderObj;

    Board(Integer size){
        this.size=size;
        this.board=new String[this.size][this.size];
        String BoardNumber="1";
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                board[i][j]=BoardNumber;
                boardMap.put(BoardNumber,new SnakeLadder(i, j,"-1", false, false));
                BoardNumber=""+(Integer.parseInt(BoardNumber)+1);
            }
        }
    }

    public void movePlayer(Player player,int diceNumber){
            SnakeLadder oldPosition=this.boardMap.get(player.currentPosition);
            int row=oldPosition.row;
            int col=oldPosition.col;
            this.board[row][col]=this.board[row][col].replace(" "+player.player.name(),"");

            int diff=100-Integer.parseInt(player.currentPosition);
            if(diff>=diceNumber){
                System.out.println("Player "+player.player.name()+" can move");
            
            }else{
                System.out.println("Player "+player.player.name()+" cannot move, as it exceeds 100");
                return;
            }
            player.currentPosition=""+(Integer.parseInt(player.currentPosition)+diceNumber);
            SnakeLadder obj=this.boardMap.get(player.currentPosition);

            if(obj.isSnake==true){
                player.currentPosition=obj.endBoardNumber;
                obj=this.boardMap.get(player.currentPosition);
                System.out.println("Player "+player.player.name()+" got bitten by a snake! Moving to "+player.currentPosition);
            }else if(obj.isLadder==true){
                player.currentPosition=obj.endBoardNumber;
                obj=this.boardMap.get(player.currentPosition);
                System.out.println("Player "+player.player.name()+" climbed a ladder! Moving to "+player.currentPosition);
            }

            row=obj.row;
            col=obj.col;

            
            this.board[row][col]=this.board[row][col]+" "+player.player.name();
           
    }
    
    public boolean checkWin(Player player){

        if(player.currentPosition.equals("100")){
            return true;
        }
        return false;
    }
}
