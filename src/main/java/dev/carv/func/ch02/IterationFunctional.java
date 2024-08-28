package dev.carv.func.ch02;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class IterationFunctional implements Iteration {

    public static void main(String[] args) {
        var iteration = new IterationImperative();
        var friends = iteration.generateNames();

        log.debug("--- Iterable for each ---");
        friends.forEach(new Consumer<String>() {
            public void accept(final String friend) {
                log.debug(friend);
            }
        });

        log.debug("--- Method reference ---");
        friends.forEach(log::debug);
    }
}
