package com.github.violettakolunova.gravitrips;

public class GameField {
    private static final int WIDTH = 7;
    private static final int HEIGTH = 6;
    private int [][] table = new int[HEIGTH][WIDTH];

    public void acceptMove(int column, int playerMark) {
        int index = -1;
        while (index + 1 < HEIGTH && table[index + 1][column] == 0) {
            index++;
        }
        table[index][column] = playerMark;
    }

    public boolean isGameEnd() {
        for (int i = 0; i < table.length; i++) {
            int counter = 0;
            for (int j = 0; j < table[i].length - 1; j++) {
                if (table[i][j] == table[i][j+1]) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
            if (counter == 3) {
                return true;
            }
        }

        for (int j = 0; j < WIDTH; j++) {
            int counter = 0;
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i][j] == table[i+1][j]) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
            if (counter == 3) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

         for (int i = 0; i < table.length; i++) {
             for (int j = 0; j < table[i].length; j++) {
                 if (table[i][j] == 0) {
                     sb.append('.');
                 } else {
                     sb.append(table[i][j]);
                 }
             }
             sb.append('\n');
         }



        return sb.toString();
    }
}
