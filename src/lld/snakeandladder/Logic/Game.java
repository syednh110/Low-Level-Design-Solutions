package lld.snakeandladder.Logic;

import lld.snakeandladder.Model.Board;
import lld.snakeandladder.Model.Cell;
import lld.snakeandladder.Model.Dice;
import lld.snakeandladder.Model.Player;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Dice dice;
    private Board board;
    private Deque<Player> players = new LinkedList<>();
    private Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10,4,5);
        dice = new Dice(1);
        winner = null;
        initializePlayers();
    }

    private void initializePlayers() {
        Player p1 = new Player("Ali",0);
        Player p2 = new Player("Sadiya",0);
        players.add(p1);
        players.add(p2);
    }

    public void startGame(){
        while (winner == null){
            Player player = findPlayerTurn();
            System.out.println("Player Turn is "+ player.id + " current positon is "+ player.currentPosition);

            int diceCount = dice.diceRoll();
            int newPosition = player.currentPosition + diceCount;
            newPosition = jumpCheck(newPosition);
            player.currentPosition = newPosition;

            System.out.println("Player Turn is "+ player.id + " current positon is "+ player.currentPosition);
            if(player.currentPosition>=board.cells.length*board.cells.length-1){
                winner = player;
            }
        }
        System.out.println("Winner is "+ winner.id);
    }

    private int jumpCheck(int newPosition) {
        if(newPosition >= board.cells.length*board.cells.length-1){
            return newPosition;
        }
        Cell cell = board.getCell(newPosition);
        if(cell.jump !=null && cell.jump.start==newPosition){
            String jumpBy = (cell.jump.start<cell.jump.end)?"Ladder":"Snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return newPosition;
    }

    private Player findPlayerTurn() {
        Player player = players.removeFirst();
        players.addLast(player);
        return player;
    }
}
