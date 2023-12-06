package com.example.ghact;

import lombok.SneakyThrows;

import java.util.Random;


/**
 * start pint.
 */
public final class Main {

    /**
     * Timeout variable.
     */
    public static final int TIMEOUT = 100;
    /**
     * sleep variable.
     */
    public static final int SLEEP = 10000;

    private Main() {

    }

    /**
     * run.
     * @param args
     */
    @SneakyThrows
    public static void main(final String[] args) {
        var transform = """
                H
                i
                 t
                 h
                 e
                 r
                 e
                 1
                 2
                 3
                 4
                 5
                 """
                .transform(String::toUpperCase)
                .transform("::"::concat);


        var result = transform;


        System.out.println(result);
        while (true) {
            var value = new Random().nextInt(TIMEOUT);
            Thread.sleep(SLEEP);
            System.out.println(value);
        }
    }
}
