package Rules;

public class ComputerChoice implements PlayerMoveStrategy {


    @Override
    public Choice makeChoice() {
        int number = (int) (Math.random() * 3);

        if (number == 0) {
            System.out.println("ROCK");
            return RpsChoice.ROCK;
        } else if (number == 1) {
            System.out.println("PRAPER");
            return RpsChoice.PAPER;
        } else {
            System.out.println("SCISSORS");
            return RpsChoice.SCISSORS;
        }

    }
}
