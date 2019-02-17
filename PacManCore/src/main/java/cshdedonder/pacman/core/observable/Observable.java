package cshdedonder.pacman.core.observable;

public interface Observable<T extends Observable<T>> {

    void addInvalidationListener(InvalidationListener<T> listener);

    boolean removeInvalidationListener(InvalidationListener<T> listener);

    default void addWeakInvalidationListener(InvalidationListener<T> listener) {
        throw new UnsupportedOperationException("Weak invalidation listeneres are not supported.");
    }

    default boolean areWeakListenersSupported() {
        return false;
    }
}
