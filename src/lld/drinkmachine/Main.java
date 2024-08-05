package lld.drinkmachine;

public class Main {
    public static void main(String[] args) {
        String drinkName = "COFFEE";
        String sugarSize = String.valueOf(Size.SMALL);
        String drinkSize = String.valueOf(Size.MEDIUM);
        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepareDrink(drinkName,drinkSize,sugarSize);
    }
}
