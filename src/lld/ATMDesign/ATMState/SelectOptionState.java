package lld.ATMDesign.ATMState;

import lld.ATMDesign.ATM;
import lld.ATMDesign.Card;
import lld.ATMDesign.TransactionType;

public class SelectOptionState extends ATMState{
    public SelectOptionState() {
        System.out.println("Please select any option");
    }

    @Override
    public void selectOption(ATM atm, Card card, TransactionType transactionType) {
        switch (transactionType){
            case BALANCE_CHECK:
                atm.setAtmState(new BalanceCheckState());
                break;
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawState());
                break;
            default:
                System.out.println("Invalid option");
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
        System.out.println("please collect your card");
    }
}
