package dev.carv.func.ch02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IterationImperative implements Iteration {

    public static void main(String[] args) {
        var iteration = new IterationImperative();
        var friends = iteration.generateNames();

        for (int i = 0; i < friends.size(); i++) {
            log.debug(friends.get(i));
        }
    }

}
