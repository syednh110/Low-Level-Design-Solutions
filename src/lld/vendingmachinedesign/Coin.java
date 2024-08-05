package lld.vendingmachinedesign;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int amount;

    Coin(int amount) {
        this.amount = amount;
    }
}
