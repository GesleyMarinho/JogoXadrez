package Aplication;

import BoardGame.Board;
import BoardGame.Position;

public class Program {
    public static void main(String[] args) {
        Board board = new Board(8,8);

        System.out.println(board);
    }
}