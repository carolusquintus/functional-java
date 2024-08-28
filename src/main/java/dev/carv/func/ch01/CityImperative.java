package dev.carv.func.ch01;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class CityImperative implements City {

    public static void main(String[] args) {
        var city = new CityImperative();
        var cities = city.generateCities(8);

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