package cshdedonder.pacman.core.cell;

import cshdedonder.pacman.core.GameState;
import cshdedonder.pacman.core.PacMan;
import cshdedonder.pacman.core.util.Cardinal;
import cshdedonder.pacman.core.util.Position;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConnectedCell extends AbstractCell {

    private static final String TYPE = "CONNECTED";

    private final Map<Cardinal, ConnectedCell> cellMap;

    private final Consumer<Integer> scoreConsumer;
    private final Consumer<GameState> stateConsumer;
    private final Supplier<Optional<Cardinal>> cardinalSupplier;
    private final Pellet pellet;

    public ConnectedCell(Position position,
                         Consumer<Integer> scoreConsumer,
                         Consumer<GameState> stateConsumer,
                         Supplier<Optional<Cardinal>> cardinalSupplier,
                         Pellet pellet) {
        super(position);
        this.pellet = pellet;
        cellMap = new EnumMap<>(Cardinal.class);
        this.stateConsumer = stateConsumer;
        this.scoreConsumer = scoreConsumer;
        this.cardinalSupplier = cardinalSupplier;
    }

    public void setNeighbour(Cardinal cardinal, ConnectedCell connectedCell) {
        cellMap.put(cardinal, connectedCell);
    }

    public ConnectedCell getNeighbour(Cardinal cardinal) {
        return cellMap.computeIfAbsent(cardinal, c -> null);
    }

    public void move(PacMan pacMan) {
        scoreConsumer.accept(pellet.getScore());
        stateConsumer.accept(pellet.getNextState(null));
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
