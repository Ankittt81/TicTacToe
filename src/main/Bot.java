package main;

import main.strategies.BotPlayingStrategy;
import main.strategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(Integer id, String name, Symbol symbol, PlayerType playerType,BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel=botDifficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }
    public Move makeMove(Board board) {
        System.out.println("Hey!" +getName()+"It's ypur turn.Please make a move.");
        return botPlayingStrategy.makeMove(board,this);
    }

}
