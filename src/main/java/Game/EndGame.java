package Game;

import Players.Players;
import Rules.Choice;
import Rules.RpsChoice;

import java.util.Scanner;

public class EndGame {
    private int winner1;
    private int winner2;
    private boolean round;
    public EndGame()
    {
        round=true;
    }

    public int getWinner1() {
        return this.winner1;
    }


    public int getWinner2() {
        return this.winner2;
    }



  public void winner(Choice choice1,Choice choice2) {

      if (choice1.equals(choice2)) {

          System.out.println("no winner");
      }
      else if (choice1.equals(RpsChoice.ROCK) && choice2.equals(RpsChoice.PAPER))
      {
          System.out.println("second player is the winner");
          winner2++;
      }
      else if (choice1.equals(RpsChoice.PAPER) && choice2.equals(RpsChoice.ROCK))
      {
          System.out.println("first player is the winner");
          winner1++;
      }
      else if (choice1.equals(RpsChoice.SCISSORS) && choice2.equals(RpsChoice.ROCK))
      {
          System.out.println("second player is the winner");
          winner2++;
      }
      else if (choice1.equals(RpsChoice.ROCK) && choice2.equals(RpsChoice.SCISSORS))
      {
          System.out.println("first player is the winner");
          winner1++;
      }else if (choice1.equals(RpsChoice.SCISSORS) && choice2.equals(RpsChoice.PAPER))
      {
          System.out.println("first player is the winner");
          winner1++;
      } else if (choice2.equals(RpsChoice.SCISSORS) && choice1.equals(RpsChoice.PAPER))
      {
              System.out.println("second player is the winner");
          winner2++;
      }
      else
      {
          System.out.println("Invalid");
      }

  }
    public void StartGame(Players player1,Players player2)
    {
        Scanner scanner=new Scanner(System.in);

        while (round)
        {
            winner(player1.makeMove(),player2.makeMove());
            System.out.println("do you want to play another round yes/no?");
            String answer=scanner.next();
            if(answer.equals("no"))
            {
                round=false;
            }

        }
        System.out.println("first player score "+getWinner1()+" the second player score "+getWinner2());
    }
}
