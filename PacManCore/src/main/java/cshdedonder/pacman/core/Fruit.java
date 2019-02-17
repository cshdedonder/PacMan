package cshdedonder.pacman.core;

@SuppressWarnings("unused")
public enum Fruit {

    CHERRY(100), STRAWBERRY(300), ORANGE(500),
    APPLE(700), MELON(1000), GALAXIAN(2000),
    BELL(3000), KEY(5000);

    private int points;

    Fruit(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
