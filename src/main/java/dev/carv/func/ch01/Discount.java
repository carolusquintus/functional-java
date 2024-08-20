package dev.carv.func.ch01;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public interface Discount {

    default List<Double> generatePrices() {
        var faker = new Faker(Locale.US);
        var prices = new ArrayList<Double>();

        IntStream.range(0, 20).forEach(i -> prices.add(Double.valueOf(faker.commerce().price())));

        return prices;
    }

    Double calculate(List<Double> prices);

}
