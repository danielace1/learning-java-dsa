package com.example.SystemDesignLearning.blackboxgame;

import com.example.SystemDesignLearning.blackboxgame.enums.Direction;
import com.example.SystemDesignLearning.blackboxgame.models.Board;
import com.example.SystemDesignLearning.blackboxgame.models.Ray;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(4, 4);

        board.placeAtom(0, 3);
        board.placeAtom(2, 1);

        board.printBoard();

        Game game = new Game(board);

        Ray ray = new Ray(1, -1, Direction.RIGHT);

        game.processRay(ray);
    }

}
