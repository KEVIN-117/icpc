package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,5,5,6,4,4654564,0,4,4,4,4,4,40,10};
        Arrays.stream(numbers).forEach(System.out::println);
    }
}