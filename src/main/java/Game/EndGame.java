package Game;

import Players.Players;
import Rules.Choice;

import java.util.Scanner;

public class EndGame {
    private Integer winner1;
    private Integer winner2;
    public void setWinner1()
    {
        this.winner1 =0;
    }

    public Integer getWinner1() {
        return this.winner1;
    }
    public void setWinner2()
    {
        this.winner2 =0;
    }

    public Integer getWinner2() {
        return this.winner2;
    }



  public String winner(Choice playerChoice1,Choice playerChoice2 ) {


      if (playerChoice1.equals(playerChoice2)) {

          System.out.println("no winner");
      } else if (playerChoice1.equals("Rock") && playerChoice2.equals("Paper") || playerChoice1.equals("Scissor") && playerChoice2.equals("Rock") || playerChoice2.equals("Scissor") && playerChoice1.equals("Paper")) {

          winner2++;
          return " first player score "+winner1+" second player score "+winner2;


      } else if(playerChoice2.equals("Rock") && playerChoice1.equals("Paper") || playerChoice2.equals("Scissor") && playerChoice1.equals("Rock") || playerChoice1.equals("Scissor") && playerChoice2.equals("Paper")) {

          winner1++;
          return " first player score "+winner1+" second player score "+winner2;
      }
  return " first player score "+winner1+" second player score "+winner2;
  }
    public void StartGame(Players player1,Players player2)
    {
        Scanner scanner=new Scanner(System.in);
        boolean round=true;
        while (round=true)
        {
            winner(player1.makeMove(),player2.makeMove());
            System.out.println("do you want to play another round yes/no?");
            String asnwer=scanner.next();
            if(asnwer.equals("no"))
            {
                round=false;
            }

        }
    }
}
