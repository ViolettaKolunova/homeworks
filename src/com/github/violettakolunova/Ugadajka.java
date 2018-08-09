package com.github.violettakolunova;

import java.util.Random;
import java.util.Scanner;

public class Ugadajka {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        while (true) {
            System.out.print("Is it ");
            System.out.print(n);
            System.out.println("?");
            Scanner scanner = new Scanner(System.in);
            String enteredLine = scanner.nextLine();
            if (enteredLine.equals("=")) {
                System.out.println("I win");
                break;
            } else {
                if (enteredLine.equals(">")) {
                    n = r.nextInt(100 - n) + n;
                }
                if (enteredLine.equals("<")) {
                    n = r.nextInt(n);
                }
            }
        }
    }
}
