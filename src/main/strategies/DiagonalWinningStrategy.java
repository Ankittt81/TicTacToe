package main.strategies;

import main.Board;
import main.Move;

public class DiagonalWinningStrategy implements WinningStrategy {
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
    public void handleUndo(Board board, Move move) {}
}
