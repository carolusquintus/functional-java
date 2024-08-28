package dev.carv.func.ch01;

import com.github.javafaker.Faker;
import dev.carv.func.RandomGenerator;

import java.util.List;
import java.util.Locale;

public interface City extends RandomGenerator {

    default List<String> generateCities(int size) {
        var faker = new Faker(Locale.US);
        return generateList(size, () -> faker.address().city());
    }

}
