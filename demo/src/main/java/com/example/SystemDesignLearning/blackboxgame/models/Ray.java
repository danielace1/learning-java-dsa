package com.example.SystemDesignLearning.blackboxgame.models;

import com.example.SystemDesignLearning.blackboxgame.enums.Direction;

public class Ray {
    private int row;
    private int col;
    private Direction direction;

    public Ray(int row, int col, Direction direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
