package lld.ATMDesign;

import lld.ATMDesign.ATMState.ATMState;
import lld.ATMDesign.ATMState.IdealState;

public class ATM {

    static ATM atmobject = new ATM();
    ATMState atmState;
    int balance;
    int twoThousandNote;
    int fiveHundredNote;
    int oneHundredNote;

    public int getTwoThousandNote() {
        return twoThousandNote;
    }

    public int getFiveHundredNote() {
        return fiveHundredNote;
    }

    public int getOneHundredNote() {
        return oneHundredNote;
    }

    public int getBalance() {
        return balance;
    }

    public void deductATMBalance(int amount){
        this.balance = balance - amount;
    }

    public void deductTwoThousandNote(int required){
        this.twoThousandNote = twoThousandNote - required;
    }

    public void deductFiveHundredNote(int required){
        this.fiveHundredNote = fiveHundredNote - required;
    }
    public void deductOneHundredNote(int required){
        this.oneHundredNote = oneHundredNote - required;
    }


    public void setATMBalance(int balance, int twoThousandNote, int fiveHundredNote, int oneHundredNote){
        this.balance = balance;
        this.twoThousandNote = twoThousandNote;
        this.fiveHundredNote = fiveHundredNote;
        this.oneHundredNote = oneHundredNote;
    }
    public ATMState getAtmState() {
        return atmState;
    }
    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    static ATM getCurrentATM() {
        atmobject.setAtmState(new IdealState());
        return atmobject;
    }

    public void currentATMState() {
        System.out.println("Balance: "+ balance);
        System.out.println("2000Notes: "+ twoThousandNote);
        System.out.println("500Notes: "+ fiveHundredNote);
        System.out.println("100Notes: "+ oneHundredNote);
    }
}
