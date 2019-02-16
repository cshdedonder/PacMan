package cshdedonder.pacman.core.util;

import cshdedonder.pacman.core.debugutil.DebugUtils;

public class Position {

    private final int posX, posY;

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getPosX() * getPosY());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position p = (Position) obj;
            return p.getPosX() == getPosX() && p.getPosY() == getPosY();
        }
        return false;
    }

    @Override
    public String toString() {
        return DebugUtils.debugString(this);
    }
}
