package lld.ATMDesign.CashFlow;

import lld.ATMDesign.ATM;

public class TwoThrousandNoteProcess extends CashWithdrawProcess {

    public TwoThrousandNoteProcess(CashWithdrawProcess cashWithdrawProcess) {
        super(cashWithdrawProcess);
    }

    @Override
    public void execute(ATM atm,int amount) {
        int required = amount/2000;
        int remaining = amount%2000;

        if(required<atm.getTwoThousandNote()){
            atm.deductTwoThousandNote(required);
        }
        else{
            remaining = remaining + (required-atm.getTwoThousandNote()) * 2000;
            atm.deductTwoThousandNote(atm.getTwoThousandNote());
        }

        if(remaining!=0){
            super.execute(atm,remaining);
        }
    }
}
