package dev.carv.func.ch01;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class DiscountFunctional implements Discount {

    public static void main(String[] args) {
        var discount = new DiscountFunctional();

        var prices = discount.generatePrices();
        log.info(prices.toString());

        log.debug("Total of discounted prices: $ {}", discount.calculate(prices));
    }

    @Override
    public Double calculate(List<Double> prices) {
        return prices.stream()
            .filter(price -> price > 20)
            .mapToDouble(price -> price * 0.9)
            .sum();
    }

}
