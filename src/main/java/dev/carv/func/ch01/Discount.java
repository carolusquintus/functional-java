package dev.carv.func.ch01;

import com.github.javafaker.Faker;
import dev.carv.func.RandomGenerator;

import java.util.List;
import java.util.Locale;

public interface Discount extends RandomGenerator {

    default List<Double> generatePrices(int size) {
        var faker = new Faker(Locale.US);
        return generateList(size, () -> Double.valueOf(faker.commerce().price()));
    }

    Double calculate(List<Double> prices);

}
