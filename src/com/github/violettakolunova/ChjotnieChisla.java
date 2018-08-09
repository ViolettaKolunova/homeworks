package com.github.violettakolunova;

import java.util.Scanner;

public class ChjotnieChisla {
    public static void main(String[] args) {
        System.out.println("Vvedite pervoe chislo");
        Scanner scanner = new Scanner(System.in);
        int pervoe = Integer.valueOf(scanner.nextLine());
        System.out.println("Vvedite vtoroe chislo");
        int vtoroe = Integer.valueOf(scanner.nextLine());
        if (pervoe > vtoroe) {
            System.out.println("Pervoe chislo dolzhno bitj menjshe vtorogo");
        } else {
            for (int i = pervoe; i <= vtoroe; i++) {
                if ((i % 2) == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
