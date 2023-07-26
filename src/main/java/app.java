import Game.EndGame;
import Players.GamePlayer;
import Rules.Choice;

public class app {

    public static void main(String[] args) {

        GamePlayer computerPlayer = new GamePlayer("Computer", "computer");

        GamePlayer humainPlayer = new GamePlayer("humain", "humain");

        EndGame game=new EndGame();
        game.StartGame(humainPlayer,computerPlayer);

    }
}
