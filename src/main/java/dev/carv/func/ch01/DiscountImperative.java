package dev.carv.func.ch01;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class DiscountImperative implements Discount {

    public static void main(String[] args) {
        var discount = new DiscountImperative();

        var prices = discount.generatePrices(11);
        log.info(prices.toString());

        log.debug("Total of discounted prices: $ {}", discount.calculate(prices));
    }

    @Override
    public Double calculate(List<Double> prices) {
        var totalOfDiscountedPrices = 0.0d;

        for (var price : prices) {
            if (price > 20) {
                totalOfDiscountedPrices += price * 0.9;
            }
        }

        return totalOfDiscountedPrices;
    }
}
