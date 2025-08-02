package SystemDesign.LowLevelDesign.SnakeLadder;

public class Main {
    public static void main(String[] args){
        PlayerType p=PlayerType.P1;
        String p1=p.name();
        System.out.println(p1);

        StartGame game=new StartGame();
        game.initialize();
        game.start();
    }
}
