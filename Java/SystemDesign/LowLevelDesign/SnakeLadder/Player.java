package SystemDesign.LowLevelDesign.SnakeLadder;

public class Player {
    PlayerType player;
    String currentPosition;
    Player(PlayerType player,String currentPosition){
        this.player=player;
        this.currentPosition=currentPosition;
    }
}
