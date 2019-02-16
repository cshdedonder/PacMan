package cshdedonder.pacman.core;

import cshdedonder.pacman.core.cell.Board;
import cshdedonder.pacman.core.util.Cardinal;

import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Class which represents the conceptual side of the Pac-Man game. This class has its own time-driven mechanisms.
 */
// TODO: make thread-safe
public class PacManGame {

    private PacMan pacMan;
    private Board board;

    private int score;

    private Timer timer;

    public PacManGame() {
        board = new Board(this::addToScore, this::changeState, this::getQueuedCardinal);
        pacMan = new PacMan(board::getCell);
        timer = new Timer();
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

    /*
    public ? render(){} // TODO
     */
}
