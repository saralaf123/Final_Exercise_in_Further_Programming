import Game.EndGame;
import Players.GamePlayer;
import Rules.Choice;

public class app {

    public static void main(String[] args) {

        GamePlayer computerPlayer = new GamePlayer("Computer", "computer");
       // Choice Move=computerPlayer.makeMove();
        GamePlayer humainPlayer = new GamePlayer("humain", "humain");
       // computerPlayer.makeMove();
        EndGame game=new EndGame();
        game.StartGame(humainPlayer,computerPlayer);

    }
}
