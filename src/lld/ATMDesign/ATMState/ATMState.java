package lld.ATMDesign.ATMState;

import lld.ATMDesign.ATM;
import lld.ATMDesign.Card;
import lld.ATMDesign.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card){
        System.out.println("!Oops something went wrong");
    }

    public void authenticate(ATM atm,Card card,int pin){
        System.out.println("!Oops something went wrong");
    }

    public void selectOption(ATM atm, Card card, TransactionType transactionType){
        System.out.println("!Oops something went wrong");
    }

    public void cashWithdraw(ATM atm,Card card,int amount){
        System.out.println("!Oops something went wrong");
    }

    public void balanceCheck(ATM atm,Card card){
        System.out.println("!Oops something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("!Oops something went wrong");
    }

    public void getCard(){
        System.out.println("!Oops something went wrong");
    }
}
