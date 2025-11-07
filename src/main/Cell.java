package main;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;
    private Player player;
    public Cell(int row, int col, CellState cellState, Player player) {
        this.row = row;
        this.col = col;
        this.cellState = cellState;
        this.player = player;
    }
}
