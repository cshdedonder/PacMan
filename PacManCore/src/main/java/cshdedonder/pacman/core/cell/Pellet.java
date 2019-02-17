package cshdedonder.pacman.core.cell;

import cshdedonder.pacman.core.GameState;

public interface Pellet {

    int getScore();

    GameState getNextState(GameState oldState);
}
