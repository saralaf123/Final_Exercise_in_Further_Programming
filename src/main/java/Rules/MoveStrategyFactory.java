package Rules;

public class MoveStrategyFactory {
    public static PlayerMoveStrategy createStrategy(String moveType) {
        if ("computer".equalsIgnoreCase(moveType)) {
            return new ComputerChoice();
        } else if ("humain".equalsIgnoreCase(moveType)) {
            return new HumainChoice();
        } else {
            throw new IllegalArgumentException("Invalid move type.");
        }
    }
}
