package com.github.violettakolunova;

import java.util.Arrays;
import java.util.Random;

public class MassivSluchajnihChisel {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 9, 3, 16, 4, 99, 56, 78};
        System.out.println(Arrays.toString(numbers));
        int summa = 0;
        for (int x : numbers) {
            summa = summa +x;
        }
        System.out.println("Summa " + summa);
    }
}
