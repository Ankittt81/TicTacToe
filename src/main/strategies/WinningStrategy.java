package main.strategies;

import main.Board;
import main.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);
    public void handleUndo(Board board, Move move);
}
