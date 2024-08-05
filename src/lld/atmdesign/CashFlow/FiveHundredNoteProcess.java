package lld.atmdesign.CashFlow;

import lld.atmdesign.ATM;

public class FiveHundredNoteProcess extends CashWithdrawProcess{

    public FiveHundredNoteProcess(CashWithdrawProcess cashWithdrawProcess) {
        super(cashWithdrawProcess);
    }

    @Override
    public void execute(ATM atm,int amount) {
        int required = amount/500;
        int remaining = amount%500;

        if(required<atm.getFiveHundredNote()){
            atm.deductFiveHundredNote(required);
        }
        else{
            remaining = remaining + (required - atm.getFiveHundredNote())*500;
            atm.deductFiveHundredNote(atm.getFiveHundredNote());
        }

        if(remaining!=0){
            super.execute(atm,remaining);
        }
    }
}
