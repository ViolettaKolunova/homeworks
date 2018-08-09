package com.github.violettakolunova.gravitrips;

public class Game {
    public static void main(String[] args) {
        GameField gameField = new GameField();
        Human player = new Human();
        Computer computer = new Computer();

        while (!gameField.isGameEnd()) {
            computer.performMove(gameField);
            System.out.println(gameField);
            player.performMove(gameField);
            System.out.println(gameField);
        }
    }
}
