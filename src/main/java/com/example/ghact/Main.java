package com.example.ghact;

import lombok.SneakyThrows;

import java.util.Arrays;

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


        while (true) {

            System.out.println(result);
            Thread.sleep(10000);
        }
    }
}
