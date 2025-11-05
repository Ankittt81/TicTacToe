package main.strategies;

import main.Board;
import main.Move;

public interface BotPlayingStrategy {
    public Move makeMove(Board board);
}
