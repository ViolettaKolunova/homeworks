package com.github.violettakolunova;

import java.util.Arrays;

public class DvumernijMassiv {
    public static void main(String[] args) {
        int[][] table = new int[][]{
                new int[]{1, 2, 1, 1, 1, 1},
                new int[]{1, 1, 1, 1, 1, 1},
                new int[]{1, 2, 1, 2, 1, 2},
        } ;
        for (int x = 0; x < table.length; x++) {
            int sklad = 0;
            for (int y = 0; y < table[x].length - 1; y++) {
                System.out.print(table[x][y] + " ");
                if (table[x][y] == table[x][y+1]) {
                    sklad++;
                }
            }
            System.out.println();
        }

    }

}
