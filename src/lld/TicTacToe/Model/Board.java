package lld.TicTacToe.Model;

public class Board {
    int size;
    PlayingPiece[][] playingPiece;

    public Board(int size) {
        this.size = size;
        this.playingPiece = new PlayingPiece[size][size];
    }


}
