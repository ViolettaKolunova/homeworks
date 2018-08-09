package com.github.violettakolunova.gravitrips;

import java.util.Random;

public class Computer implements Player {
    @Override
    public void performMove(GameField gameField) {
        Random random = new Random();
        int someInt = random.nextInt(7);
        gameField.acceptMove(someInt, 2);

    }
}
