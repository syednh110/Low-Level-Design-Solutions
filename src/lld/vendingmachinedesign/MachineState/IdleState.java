package lld.vendingmachinedesign.MachineState;

import lld.vendingmachinedesign.Coin;
import lld.vendingmachinedesign.Item;
import lld.vendingmachinedesign.VendingMachineSetup;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState() {
        System.out.println("Welcome! Click on InsertButton");
    }

    public IdleState(VendingMachineSetup vendingMachineSetup) {
        System.out.println("Welcome! Click on InsertButton");
        vendingMachineSetup.setCoinList(new ArrayList<>());
    }


    @Override
    public void clickOnInsertButton(VendingMachineSetup vendingMachineSetup) throws Exception {
        vendingMachineSetup.setState(new hasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachineSetup vendingMachineSetup, Coin coin) throws Exception {
        throw new Exception("Insertion Not Allowed in IDle State");
    }

    @Override
    public void clickOnProductSelectButton(VendingMachineSetup vendingMachineSetup) throws Exception {
        throw new Exception("Product selection not allowed in Idle state");
    }

    @Override
    public void selectProduct(VendingMachineSetup vendingMachineSetup,int productCode) throws Exception {
        throw new Exception("Product selection not allowed in Idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachineSetup vendingMachineSetup,int code) throws Exception {
        throw new Exception("Product dispense not allowed in Idle State");
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        throw new Exception("Get Coin not allowed in Idle state");
    }

    @Override
    public List<Coin> fullRefund(VendingMachineSetup vendingMachineSetup) throws Exception {
        throw new Exception("Refund operation not allowed in Idle State");
    }

    @Override
    public void updateInventory(VendingMachineSetup vendingMachineSetup, Item item, int codeNumber) throws Exception {
        vendingMachineSetup.getInventory().addItem(item,codeNumber);
    }
}
