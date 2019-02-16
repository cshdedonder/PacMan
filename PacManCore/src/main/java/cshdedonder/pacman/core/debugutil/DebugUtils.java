package cshdedonder.pacman.core.debugutil;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class DebugUtils {

    public static String debugString(final Object obj) {
        Class<?> classObject = obj.getClass();
        String name = "[" + classObject.getName() + "]";
        String info = Arrays.stream(classObject.getDeclaredFields())
                .unordered()
                .parallel()
                .peek(f -> f.setAccessible(true))
                .filter(f -> !f.isAnnotationPresent(DebugStringExclude.class))
                .<Optional<String>>map(f -> {
                    try {
                        return Optional.of(f.getName() + ":" + f.get(obj).toString());
                    } catch (IllegalAccessException ignored) {
                        return Optional.empty();
                    }
                })
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.joining(",", " {", "}"));
        return name + info;
    }
}
