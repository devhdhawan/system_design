package SystemDesign.LowLevelDesign.SnakeLadder;

public class Snake {
    
    public boolean insertSnake(Board board,String startBoardNumber,String endBoardNumber){
        
        SnakeLadder startCoordinates=board.boardMap.get(startBoardNumber);
        int startRow=startCoordinates.row;
        int startCol=startCoordinates.col;
        
        if(startCoordinates.isLadder==false){
            board.boardMap.put(startBoardNumber,new SnakeLadder(startRow, startCol, endBoardNumber,true, false));
            System.out.println("Snake added: Head:"+startBoardNumber+" Tail:"+endBoardNumber);
        }
        else{
            System.out.println("Cannot put Snake, Ladder is present!!");
            System.out.println("Please select another coordinate");
            return false;
        }
        return true;
     

    }

   
}
