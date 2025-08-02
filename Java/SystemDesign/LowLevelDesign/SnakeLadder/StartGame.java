package SystemDesign.LowLevelDesign.SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StartGame {

    Deque<Player> player = new LinkedList<>();
    Snake snake;
    Ladder ladder;
    Board board;
    
    public void initialize(){
        
        board = new Board(10);
        snake = new Snake();
        ladder = new Ladder();
        addPlayer();
        addSnakeLadder();
    }
    public void addPlayer(){
        Player player1=new Player(PlayerType.P1,"1");
        board.board[0][0]=board.board[0][0]+" "+player1.player.name();
        Player player2=new Player(PlayerType.P2,"1");
        board.board[0][0]=board.board[0][0]+" "+player2.player.name();

        player.add(player1);
        player.add(player2);
    }
    public void displayBoard(Board board){
        for(int i=0;i<board.size;i++){
            for(int j=0;j<board.size;j++){
                System.out.print(board.board[i][j]+" |");
            }
            System.out.println();
        }
    }
    public Player findPlayer(){
        Player playerturn=player.removeFirst();
        player.addLast(playerturn);
        return playerturn;
    }
    public int rollDice(){
        Random random=new Random();
        System.out.println("Roll the dice");
        int diceNumber=random.nextInt(6-1+1)+1;
        System.out.println("DICE NUMBER:" + diceNumber);

        return diceNumber;
    }

    public void addSnakeLadder(){
        int snakehead;
        int snaketail;
        int numberOfSnake=4;
        while(numberOfSnake>0){
        snakehead=ThreadLocalRandom.current().nextInt(2,100);
        snaketail=ThreadLocalRandom.current().nextInt(2,100);
            if(snakehead>snaketail){  
               
                if(snake.insertSnake(board, ""+snakehead, ""+snaketail)==true)
                    numberOfSnake--;

            }
        }

        int ladderhead;
        int laddertail;
        int numberOfLadder=4;
        while(numberOfLadder>0){
        ladderhead=ThreadLocalRandom.current().nextInt(2,100);
        laddertail=ThreadLocalRandom.current().nextInt(2,100);
            if(ladderhead<laddertail){  
                
                if(ladder.insertLadder(board, ""+ladderhead, ""+laddertail))
                    numberOfLadder--;
                    
            }
        }

        
    }

    public void start() {
        
        // Sample Snakes and Ladders
        // snake.insertSnake(board, "34", "7");
        // ladder.insertLadder(board, "3", "22");
      
        // Game loop
        while (true) {
            // Player 1's turn
        
            Player playerturn = findPlayer();
            System.out.println("Player:"+playerturn.player.name()+" turn");
    
            int diceNumber=rollDice();
            System.out.println("DICE NUMBER:" + diceNumber);

            board.movePlayer(playerturn,diceNumber);
            displayBoard(board);
            if (board.checkWin(playerturn)) {
                System.out.println("Player:"+playerturn.player.name()+" wins!");
                break;
            }

            
        }
    }
}
