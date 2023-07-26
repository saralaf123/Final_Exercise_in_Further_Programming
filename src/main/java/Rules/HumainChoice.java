package Rules;

import java.util.Scanner;

public class HumainChoice implements PlayerMoveStrategy {

    @Override
    public Choice makeChoice() {
        System.out.println("welcome to  rock, paper, scissors");
        System.out.println("can you say your choice?");
        Scanner scanner= new Scanner(System.in);
        String rps=scanner.next();
        switch (rps) {
            case "rock":
                return RpsChoice.ROCK;
            case "paper":
                return RpsChoice.PAPER;
            case "scissors":
                return RpsChoice.SCISSORS;
            default:
                System.out.println("Invalid choice. Please try again.");
                return makeChoice();
        }

    }
}
