package cshdedonder.pacman.core.util;

import cshdedonder.pacman.core.debugutil.DebugUtils;

public class DoublePosition {

    private final double posX, posY;

    public DoublePosition(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public Position toSingle() {
        return new Position((int) Math.round(getPosX()), (int) Math.round(getPosY()));
    }

    @Override
    public int hashCode() {
        return Double.hashCode(posX * posY);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DoublePosition) {
            DoublePosition p = (DoublePosition) obj;
            return p.getPosX() == getPosX() && p.getPosY() == getPosY();
        }
        return false;
    }

    @Override
    public String toString() {
        return DebugUtils.debugString(this);
    }
}
