package lld.atmdesign.ATMState;

import lld.atmdesign.ATM;
import lld.atmdesign.Card;
import lld.atmdesign.CashFlow.CashWithdrawProcess;
import lld.atmdesign.CashFlow.FiveHundredNoteProcess;
import lld.atmdesign.CashFlow.OneHundredNoteProcess;
import lld.atmdesign.CashFlow.TwoThrousandNoteProcess;

public class CashWithdrawState extends ATMState{
    public CashWithdrawState() {
        System.out.println("Please enter an amount");
    }

    @Override
    public void cashWithdraw(ATM atm, Card card,int amount) {
        if(atm.getBalance()<amount){
            System.out.println("Insufficient balance in ATM");
            exit(atm);
        }
        else if(card.getBankBalance()<amount){
            System.out.println("Insufficient balance in Card");
            exit(atm);
        }
        else{
            atm.deductATMBalance(amount);
            card.deductBankAmount(amount);

            CashWithdrawProcess cashWithdrawProcess = new TwoThrousandNoteProcess(new FiveHundredNoteProcess(new OneHundredNoteProcess(null)));
            cashWithdrawProcess.execute(atm, amount);
            System.out.println(card.getBankBalance());
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        atm.setAtmState(new IdealState());
        getCard();
        System.out.println("Exit happen");
    }

    @Override
    public void getCard() {
        System.out.println("Please collect your card");
    }
}
