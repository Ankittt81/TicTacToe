package main;

public class Human extends Player {
    private int level;
    private int coins;
    public Human(Integer id, String name, Symbol symbol, PlayerType playerType){
        super(id, name, symbol, playerType);
        this.level = 1;
        this.coins = 50;
    }
}
