package lld.atmdesign;

public class Card {
    private String cardHolderName;
    private int cardNumber;
    private int ccv;
    private int expiry;
    private int PIN_NUMBER = 123;
    private UserBankAccount userBankAccount;

    public boolean isCorrectPinNumber(int pin){
        if(pin==PIN_NUMBER){
            return true;
        }
        return false;
    }
    public int getBankBalance(){
        return userBankAccount.balance;
    }

    public void deductBankAmount(int amount){
        this.userBankAccount.withDrawBalance(amount);
    }

    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
}
