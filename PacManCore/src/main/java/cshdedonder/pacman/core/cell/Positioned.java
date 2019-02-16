package cshdedonder.pacman.core.cell;

import cshdedonder.pacman.core.util.Position;

public interface Positioned {

    Position getPosition();

    default int getX() {
        return getPosition().getPosX();
    }

    default int getY() {
        return getPosition().getPosY();
    }
}
