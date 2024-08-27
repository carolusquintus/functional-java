package dev.carv.func;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public interface RandomGenerator {

    default <T> List<T> generateList(int size, Supplier<T> supplier) {
        return IntStream
            .range(0, size)
            .mapToObj(i -> supplier.get())
            .toList();
    }

}
