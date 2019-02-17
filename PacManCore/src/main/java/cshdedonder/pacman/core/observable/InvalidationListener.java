package cshdedonder.pacman.core.observable;

public interface InvalidationListener<T extends Observable> {

    void invalidate(T observable);
}
