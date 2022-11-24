package lld.ATMDesign;

public class UserBankAccount {
    int balance;

    public void withDrawBalance(int amount){
        this.balance = this.balance - amount;
    }
}
