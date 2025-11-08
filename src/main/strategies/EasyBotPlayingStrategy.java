package main.strategies;

import main.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    //Bot make the move in the next empty cell
    public Move makeMove(Board board, Player player) {
        for(List<Cell> row: board.getGrid()){
            for(Cell cell: row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(cell.getRow(), cell.getCol()), player);
                }
            }
        }
        return null;
    }
}
