package com.example.ghact;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.Random;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {
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
            var value = new Random().nextInt(100);
            Thread.sleep(10000);
            System.out.println(value);
        }
    }
}
