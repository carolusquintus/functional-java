package dev.carv.func.ch01;

import com.github.javafaker.Faker;
import dev.carv.func.RandomGenerator;

import java.util.List;
import java.util.Locale;

public interface City extends RandomGenerator {

    default List<String> generateCities() {
        var faker = new Faker(Locale.US);
        return generateList(20, () -> faker.address().city());
    }

}
