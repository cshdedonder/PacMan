package cshdedonder.pacman.core.cell;

import cshdedonder.pacman.core.GameState;
import cshdedonder.pacman.core.util.Cardinal;
import cshdedonder.pacman.core.util.DoublePosition;
import cshdedonder.pacman.core.util.Position;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Board {

    private final Map<Position, ConnectedCell> cellMap;
    private final Consumer<Integer> scoreConsumer;
    private final Consumer<GameState> stateConsumer;
    private final Supplier<Optional<Cardinal>> cardinalSupplier;

    public Board(Consumer<Integer> scoreConsumer,
                 Consumer<GameState> stateConsumer,
                 Supplier<Optional<Cardinal>> cardinalSupplier) {
        this.scoreConsumer = scoreConsumer;
        this.stateConsumer = stateConsumer;
        this.cardinalSupplier = cardinalSupplier;
        cellMap = new HashMap<>();
        init();
    }

    private void init() {

    }

    public ConnectedCell getCell(Position position) {
        return cellMap.computeIfAbsent(position, p -> null);
    }

    public ConnectedCell getCell(DoublePosition position) {
        return getCell(position.toSingle());
    }
}
