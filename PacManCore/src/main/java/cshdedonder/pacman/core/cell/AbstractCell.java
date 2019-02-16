package cshdedonder.pacman.core.cell;

import cshdedonder.pacman.core.util.Position;

public abstract class AbstractCell implements Positioned {

    private final Position position;

    protected AbstractCell(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    public abstract String getType();
}
