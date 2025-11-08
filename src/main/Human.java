package main;

import java.util.Scanner;

public class Human extends Player {
    private int level;
    private int coins;
    private static Scanner scanner = new Scanner(System.in);
    public Human(Integer id, String name, Symbol symbol, PlayerType playerType){
        super(id, name, symbol, playerType);
        this.level = 1;
        this.coins = 50;
    }
    public Move makeMove(Board board){
        System.out.println("Hey!"+getName()+" It's your turn.Please make the move.");
        System.out.println("Please enter the row in which you want to make the move:");
        int row=scanner.nextInt();
        System.out.println("Please enter the column in which you want to make the move:");
        int column=scanner.nextInt();
        return new Move(new Cell(row,column),this);

    }
}
