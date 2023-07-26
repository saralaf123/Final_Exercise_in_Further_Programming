package Players;

import Rules.PlayerMoveStrategy;
import Rules.MoveStrategyFactory;
import  Rules.Choice;
public class GamePlayer implements Players{


    private String name;
    private PlayerMoveStrategy moveStrategy;

    public GamePlayer(String name, String moveType) {
        this.name = name;
        this.moveStrategy = MoveStrategyFactory.createStrategy(moveType);
    }

    @Override
    public String getName() {
        return name;
    }

    public Choice makeMove() {
        return moveStrategy.makeChoice();
    }


}
