package com.github.violettakolunova.gravitrips;

import java.util.Scanner;

public class Human implements Player{

    @Override
    public void performMove(GameField gameField) {
        System.out.println("Viberite jachejku ot 1 do 7");
        Scanner scanner = new Scanner(System.in);
        int someInt = Integer.valueOf(scanner.nextLine());
        gameField.acceptMove(someInt - 1, 1);

    }
}
