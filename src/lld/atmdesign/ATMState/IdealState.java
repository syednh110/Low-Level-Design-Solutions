package lld.atmdesign.ATMState;

import lld.atmdesign.ATM;
import lld.atmdesign.Card;

public class IdealState extends ATMState{

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is in process");
        atm.setAtmState(new HashCardState());
    }
}
