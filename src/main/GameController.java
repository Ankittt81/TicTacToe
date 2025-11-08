package main;

import main.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    public static Scanner input = new Scanner(System.in);
    public Game startGame(){
        //get the dimension
        int dimension=getDimension();
        //get the player details
        List<Player> players=getPlayers(dimension);

        //ask for winning strategies
        List<WinningStrategy> winningStrategies=new ArrayList<>();


        return new Game(dimension,players,winningStrategies);
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }
    public void display(Game game){
        game.display();
    }

    public void makeMove(Game game){
        game.makeMove();
    }
    public String getWinner(Game game){
        return null;
    }
    private int getDimension(){
        System.out.print("Enter the size of the board: ");
        int dimension=input.nextInt();
        return dimension;
    }

    private List<Player> getPlayers(int dimension){
        System.out.println("Let's add the players now : ");
        List<Player> players=new ArrayList<>();
        for(int i=0;i<dimension-1;i++){
//            System.out.println("Add Player details : Name Symbol");
//            String details=input.nextLine();
//            String[] detailsArray=details.split(",");
            System.out.println("Enter the player name: ");
            String name=input.next();
            System.out.println("Enter the player symbol: ");
            String symbol=input.next();
            Player player=new Human(i,name,new Symbol(symbol),PlayerType.HUMAN);
            players.add(player);
        }
        return players;
    }
}
