package lld.ATMDesign.ATMState;

import lld.ATMDesign.ATM;
import lld.ATMDesign.Card;

public class IdealState extends ATMState{

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is in process");
        atm.setAtmState(new HashCardState());
    }
}
