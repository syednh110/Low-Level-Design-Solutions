package lld.TicTacToe;

import lld.TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;


public class TicTacToeGame {
    private Deque<Players> players;
    private Board board;
    private String name;

    public TicTacToeGame() {
        players = new LinkedList<>();
        board = new Board(3);
        initializeGame();
    }

    private void initializeGame() {
        PlayingPieceX playingPieceX = new PlayingPieceX();
        Players players1 = new Players("players1",playingPieceX);

        PlayingPieceO playingPieceO = new PlayingPieceO();
        Players players2 = new Players("players2",playingPieceO);

        players.add(players1);
        players.add(players2);
    }

    public void startGame(){
        boolean winner = true;
        while(winner){
            //Get the player for there turn
            Players player = players.removeFirst();

            //
        }
    }
}
