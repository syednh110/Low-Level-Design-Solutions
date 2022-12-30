package lld.SnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    public Cell[][] cells;
    public Board(int boardSize,int numberOfSnake,int numberOfLadder){
        initializeCells(boardSize);
        addSnakeAndLadder(numberOfLadder,numberOfSnake);
    }
    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for (int i=0;i<boardSize;i++){
            for (int j=0;j<boardSize;j++){
                cells[i][j] = new Cell();
            }
        }
    }
    private void addSnakeAndLadder(int numberOfLadder, int numberOfSnake) {
        while (numberOfLadder>0){
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(ladderStart>=ladderEnd)
                continue;

            Jump jump = new Jump();
            jump.start = ladderStart;
            jump.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = jump;
            numberOfLadder--;
        }

        while (numberOfSnake>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(snakeTail>=snakeHead)
                continue;

            Jump jump = new Jump();
            jump.start = snakeHead;
            jump.end = snakeTail;
            Cell cell = getCell(snakeHead);
            cell.jump = jump;

            numberOfSnake--;
        }
    }

    public Cell getCell(int playerPosition) {
        int row = playerPosition/cells.length;
        int col = playerPosition% cells.length;

        return cells[row][col];
    }



}
