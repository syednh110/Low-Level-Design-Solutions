package lld.atmdesign.ATMState;

import lld.atmdesign.ATM;
import lld.atmdesign.Card;

public class BalanceCheckState extends ATMState{
    @Override
    public void balanceCheck(ATM atm, Card card) {
        System.out.println("Balance is: "+ card.getBankBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new IdealState());
        System.out.println("exit happen");
    }

    @Override
    public void getCard() {
        System.out.println("please collect your card");
    }
}
