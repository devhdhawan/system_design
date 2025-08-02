package SystemDesign.LowLevelDesign.SnakeLadder;

public class Ladder {
    public boolean insertLadder(Board board,String startBoardNumber,String endBoardNumber){
        
        SnakeLadder startCoordinates=board.boardMap.get(startBoardNumber);
        int startRow=startCoordinates.row;
        int startCol=startCoordinates.col;
        
        if(startCoordinates.isSnake==false){
            board.boardMap.put(startBoardNumber,new SnakeLadder(startRow, startCol, endBoardNumber,false, true));
            System.out.println("Ladder added: Head:"+startBoardNumber+" Tail:"+endBoardNumber);
        }
        else{
            System.out.println("Cannot put Ladder, Snake is present!!");
            System.out.println("Please select another coordinate");
            return false;
        }
        return true;

    }
}
