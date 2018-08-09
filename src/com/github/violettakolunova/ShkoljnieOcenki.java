package com.github.violettakolunova;

import java.util.Arrays;
import java.util.Random;

public class ShkoljnieOcenki {
    public static void main(String[] args) {
        int[] marks = new int[30];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(marks));

        int max = 0;
        for (int j = 0; j < marks.length; j++) {
            if (marks[j] > max) {
                max = marks[j];
            }

        }
        System.out.println("Max = " + max);

        int min = 10;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Min = " + min);

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = marks[i] + sum;
        }
        double average = (double) sum / marks.length;
        System.out.println("Average = " + average);

        int maxCounter = 0;
        int popularMark = 0;
        for (int j = 0; j <= 10; j++) {
            int counter = 0;
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] == j) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                popularMark = j;
            }

        }
        System.out.println("Popular mark = " + popularMark + "(" + maxCounter + ")");

        int minCounter = 0;
        int notPopularMark = 0;
        for (int i = 0; i <= 0; i++) {
//            if (marks[])
        }

    }
}
