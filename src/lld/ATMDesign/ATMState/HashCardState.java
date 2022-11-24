package lld.ATMDesign.ATMState;

import lld.ATMDesign.ATM;
import lld.ATMDesign.Card;

public class HashCardState extends ATMState{
    public HashCardState() {
        System.out.println("Enter your card pin number");
    }

    @Override
    public void authenticate(ATM atm, Card card, int pin) {
        boolean isCorrectPin = card.isCorrectPinNumber(pin);
        if(isCorrectPin){
            atm.setAtmState(new SelectOptionState());
        }
        else {
            System.out.println("Invalid Pin number");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        getCard();
        atm.setAtmState(new IdealState());
        System.out.println("Exit happen");
    }

    @Override
    public void getCard() {
        System.out.println("Please collect your card");
    }
}
