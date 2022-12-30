package lld.SnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCount;
    private int min = 0;
    private int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int diceRoll(){
        int dice = 0;
        int totalCount = 0;
        while(dice<diceCount){
            totalCount += ThreadLocalRandom.current().nextInt(min,max+1);
            dice++;
        }
        return totalCount;
    }
}
