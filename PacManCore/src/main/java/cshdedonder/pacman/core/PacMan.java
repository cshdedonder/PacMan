package cshdedonder.pacman.core;

import cshdedonder.pacman.core.cell.ConnectedCell;
import cshdedonder.pacman.core.util.Cardinal;
import cshdedonder.pacman.core.util.DoublePosition;

import java.util.function.Function;

public class PacMan {

    private final Function<DoublePosition, ConnectedCell> cellFunction;
    private DoublePosition position;
    private Cardinal cardinal;

    public PacMan(Function<DoublePosition, ConnectedCell> cellFunction) {
        this.cellFunction = cellFunction;
        position = new DoublePosition(14.5, 8.0);
        cardinal = Cardinal.EAST;
    }

    public void move() {
        cellFunction.apply(position).move(this);
    }

    public DoublePosition getPosition() {
        return position;
    }

    public void setPosition(DoublePosition position) {
        this.position = position;
    }

    public Cardinal getCardinal() {
        return cardinal;
    }

    public void setCardinal(Cardinal cardinal) {
        this.cardinal = cardinal;
    }
}
