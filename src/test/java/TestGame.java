import Game.EndGame;
import Rules.Choice;
import Rules.RpsChoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Players.GamePlayer;
public class TestGame {
    @Test
    public void TestComputerPlayer()
    {
        GamePlayer computerPlayer = new GamePlayer("Computer", "computer");
        Choice Move=computerPlayer.makeMove();
        Assertions.assertEquals("ROCK",Move);

    }
    @Test
    public  void TestHumainPlayer()
    {
        GamePlayer humainMove = new GamePlayer("humain", "humain");
        Choice Move=humainMove.makeMove();
        Assertions.assertEquals("ROCK",Move);
    }

}
