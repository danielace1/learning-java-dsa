package com.example.SystemDesignLearning.blackboxgame;

import com.example.SystemDesignLearning.blackboxgame.enums.Direction;
import com.example.SystemDesignLearning.blackboxgame.models.Board;
import com.example.SystemDesignLearning.blackboxgame.models.Ray;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void processRay(Ray ray) {
        while (true) {

            if (shouldReflect(ray)) {
                System.out.println("R");
                return;
            }

            refract(ray);

            // Move the ray one step
            ray.move();

            // Has it left the board?
            if (!board.isInside(ray.getRow(), ray.getCol())) {
                System.out.println(getExitPoint(ray));
                return;
            }

            // hit the atom
            if (board.hasAtom(ray.getRow(), ray.getCol())) {
                System.out.println("H");
                return;
            }

        }
    }

    public boolean shouldReflect(Ray ray) {
        return hasUpperDiagonal(ray) && hasLowerDiagonal(ray);
    }

    public void refract(Ray ray) {

        boolean upper = hasUpperDiagonal(ray);
        boolean lower = hasLowerDiagonal(ray);

        if (upper == lower) {
            return;
        }

        switch (ray.getDirection()) {
            case RIGHT:
                ray.setDirection(upper ? Direction.DOWN : Direction.UP);
                break;

            case LEFT:
                ray.setDirection(upper ? Direction.UP : Direction.DOWN);
                break;

            case UP:
                ray.setDirection(upper ? Direction.RIGHT : Direction.LEFT);
                break;

            case DOWN:
                ray.setDirection(upper ? Direction.LEFT : Direction.RIGHT);
                break;

        }
    }

    private boolean hasAtom(int row, int col) {
        if (!board.isInside(row, col)) {
            return false;
        }

        return board.hasAtom(row, col);
    }

    public boolean hasUpperDiagonal(Ray ray) {
        int row = getNextRow(ray);
        int col = getNextCol(ray);

        switch (ray.getDirection()) {
            case RIGHT:
                return hasAtom(row - 1, col + 1);
            case LEFT:
                return hasAtom(row - 1, col - 1);
            case UP:
                return hasAtom(row - 1, col - 1);
            case DOWN:
                return hasAtom(row + 1, col - 1);

        }

        return false;
    }

    public boolean hasLowerDiagonal(Ray ray) {
        int row = getNextRow(ray);
        int col = getNextCol(ray);

        switch (ray.getDirection()) {
            case RIGHT:
                return hasAtom(row + 1, col + 1);
            case LEFT:
                return hasAtom(row + 1, col - 1);
            case UP:
                return hasAtom(row - 1, col + 1);
            case DOWN:
                return hasAtom(row + 1, col + 1);
        }

        return false;
    }

    private int getNextRow(Ray ray) {
        switch (ray.getDirection()) {
            case UP:
                return ray.getRow() - 1;

            case DOWN:
                return ray.getRow() + 1;
            default:
                return ray.getRow();
        }
    }

    private int getNextCol(Ray ray) {

        switch (ray.getDirection()) {

            case LEFT:
                return ray.getCol() - 1;

            case RIGHT:
                return ray.getCol() + 1;

            default:
                return ray.getCol();
        }
    }

    private String getExitPoint(Ray ray) {
        if (ray.getCol() < 0) {
            return "R" + getRowNumber(ray.getRow());
        }

        if (ray.getCol() >= board.getCols()) {
            return "R" + getRowNumber(ray.getRow());
        }

        if (ray.getRow() < 0) {
            return "C" + (ray.getCol() + 1);
        }

        if (ray.getRow() >= board.getRows()) {
            return "C" + (ray.getCol() + 1);
        }

        return "";
    }

    private int getRowNumber(int row) {
        return board.getRows() - row;
    }

}
