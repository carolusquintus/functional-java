package dev.carv.func.ch02;

import com.github.javafaker.Faker;
import dev.carv.func.RandomGenerator;

import java.util.List;
import java.util.Locale;

public interface Iteration extends RandomGenerator {

    default List<String> generateNames(int size) {
        var faker = new Faker(Locale.US);
        return generateList(size, () -> faker.name().firstName());
    }

}
