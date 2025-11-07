package main;

public abstract class Player {
    private Integer id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(Integer id, String name, Symbol symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
}
