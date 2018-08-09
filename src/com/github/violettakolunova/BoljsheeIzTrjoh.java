package com.github.violettakolunova;

import java.util.Scanner;

public class BoljsheeIzTrjoh {
    public static void main(String[] args) {
        System.out.println("Enter number A");
        Scanner scanner = new Scanner(System.in);
        int someIntA = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter number B");
        int someIntB = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter number C");
        int someIntC= Integer.valueOf(scanner.nextLine());
        if ((someIntA == someIntB) && (someIntB == someIntC)) {
            System.out.println("A=B=C");
            return;
        }
        System.out.println("Biggest number is ");
        if ((someIntA > someIntB) && (someIntA > someIntC)) {
            System.out.println(someIntA);
        }
        if ((someIntA < someIntB) && (someIntB < someIntC)) {
            System.out.println(someIntC);
        }
        if ((someIntA < someIntB) && (someIntB > someIntC)) {
            System.out.println(someIntB);
        }
    }
}