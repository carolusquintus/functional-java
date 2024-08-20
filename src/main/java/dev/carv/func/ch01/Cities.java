package dev.carv.func.ch01;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

@Slf4j
public class Cities {

    public static void main(String[] args) {
        var faker = new Faker(Locale.of("es", "MX"));
        var cities = new ArrayList<String>();

        IntStream.range(0, 20).forEach(i -> cities.add(faker.address().city()));

        log.info(cities.toString());

        var cityName = "Xochimilco";
        findCityImperative(cityName, cities);
        findCityDeclarative(cityName, cities);
    }

    public static void findCityImperative(String name, List<String> cities) {
        boolean found = false;
        for (String city : cities) {
            if (city.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        log.info(found ? "Found" : "Not found");
    }

    public static void findCityDeclarative(String name, List<String> cities) {
        var found = cities.contains(name);
        log.info(found ? "Found" : "Not found");
    }

}