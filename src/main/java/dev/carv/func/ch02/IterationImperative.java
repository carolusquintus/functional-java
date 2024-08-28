package dev.carv.func.ch02;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Slf4j
public class IterationImperative implements Iteration {

    public static void main(String[] args) {
        var iteration = new IterationImperative();
        var friends = iteration.generateNames(9);

        log.debug("--- Classic for ---");
        for (int i = 0; i < friends.size(); i++) {
            log.debug(friends.get(i));
        }

        log.debug("--- Classic for each ---");
        for (var friend : friends) {
            log.debug(friend);
        }
    }

}
