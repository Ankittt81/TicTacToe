package main.strategies;

import main.Board;
import main.Move;
import main.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
