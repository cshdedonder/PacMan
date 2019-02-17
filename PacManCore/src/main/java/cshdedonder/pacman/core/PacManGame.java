package cshdedonder.pacman.core;

import cshdedonder.pacman.core.cell.Board;
import cshdedonder.pacman.core.observable.InvalidationListener;
import cshdedonder.pacman.core.observable.Observable;
import cshdedonder.pacman.core.util.Cardinal;

import java.lang.ref.WeakReference;
import java.util.*;

/**
 * Class which represents the conceptual side of the Pac-Man game. This class has its own time-driven mechanisms.
 * (@Ref http://gameinternals.com/post/2072558330/understanding-pac-man-ghost-behavior)
 */
// TODO: make thread-safe
public class PacManGame implements Observable<PacManGame> {

    private PacMan pacMan;
    private Board board;

    private int score;

    private Timer timer;

    private final Set<InvalidationListener<PacManGame>> listeners;
    private final Set<WeakReference<InvalidationListener<PacManGame>>> weakListeners;

    public PacManGame() {
        board = new Board(this::addToScore, this::changeState, this::getQueuedCardinal);
        pacMan = new PacMan(board::getCell);
        timer = new Timer();

        listeners = new HashSet<>();
        weakListeners = new HashSet<>();
    }

    public void start() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                tick();
            }
        }, 0, 200);
    }

    private void tick() {
        // TODO
    }

    public void stop() {
        timer.cancel();
    }

    private void addToScore(int amount) {
        score += amount;
    }

    private void changeState(GameState state) {
        // TODO
    }

    private Optional<Cardinal> getQueuedCardinal() {
        return null; // TODO
    }

    @Override
    public void addInvalidationListener(InvalidationListener<PacManGame> listener) {
        listeners.add(listener);
    }

    @Override
    public boolean removeInvalidationListener(InvalidationListener<PacManGame> listener) {
        return listeners.remove(listener);
    }

    @Override
    public void addWeakInvalidationListener(InvalidationListener<PacManGame> listener) {
        weakListeners.add(new WeakReference<>(listener));
    }

    @Override
    public boolean areWeakListenersSupported() {
        return true;
    }

    private void fireInvalidationEvent() {
        listeners.forEach(listener -> listener.invalidate(this));
        weakListeners.stream()
                .map(WeakReference::get)
                .filter(Objects::nonNull)
                .forEach(listener -> listener.invalidate(this));
    }

    /*
    public ? render(){} // TODO
     */
}
