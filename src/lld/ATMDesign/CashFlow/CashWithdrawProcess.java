package lld.ATMDesign.CashFlow;

import lld.ATMDesign.ATM;

public abstract class CashWithdrawProcess {

    CashWithdrawProcess cashWithdrawProcess;

    public CashWithdrawProcess(CashWithdrawProcess cashWithdrawProcess) {
        this.cashWithdrawProcess = cashWithdrawProcess;
    }

    public void execute(ATM atm, int amount){
        if(cashWithdrawProcess!=null){
            cashWithdrawProcess.execute(atm,amount);
        }
    }
}
