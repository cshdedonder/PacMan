package cshdedonder.pacman.core.util;

import static cshdedonder.pacman.core.util.Direction.HORIZONTAL;
import static cshdedonder.pacman.core.util.Direction.VERTICAL;

public enum Cardinal {
    NORTH(VERTICAL), EAST(HORIZONTAL), WEST(HORIZONTAL), SOUTH(VERTICAL);

    private Direction direction;

    Cardinal(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
