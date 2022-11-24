package lld.ATMDesign.CashFlow;

import lld.ATMDesign.ATM;

public class OneHundredNoteProcess extends CashWithdrawProcess{

    public OneHundredNoteProcess(CashWithdrawProcess cashWithdrawProcess) {
        super(cashWithdrawProcess);
    }

    @Override
    public void execute(ATM atm, int amount) {
        int required = amount/100;
        int remaining = amount%100;

        if(required<atm.getOneHundredNote()){
            atm.deductOneHundredNote(required);
        }
        else{
            remaining = remaining + (required-atm.getOneHundredNote())*100;
            atm.deductOneHundredNote(atm.getOneHundredNote());
        }

        if(remaining!=0){
            super.execute(atm, amount);
        }
    }
}
