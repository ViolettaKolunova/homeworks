package com.github.violettakolunova;

import java.util.Arrays;

public class Naiboljshee {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 77, 45, 66, 23};
        System.out.println(Arrays.toString(numbers));
        int naiboljshee = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > naiboljshee) {
                naiboljshee = numbers[i];
            }
        }
        System.out.println(naiboljshee);
    }
}
