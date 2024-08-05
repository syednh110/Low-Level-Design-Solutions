package lld.vendingmachinedesign.MachineState;

import lld.vendingmachinedesign.Coin;
import lld.vendingmachinedesign.Item;
import lld.vendingmachinedesign.VendingMachineSetup;

import java.util.List;

public class hasMoneyState implements State{

    public hasMoneyState() {
        System.out.println("You are in HasMoneyState. You can insert coin or click on product selection Button!");
    }

    @Override
    public void clickOnInsertButton(VendingMachineSetup vendingMachineSetup) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachineSetup vendingMachineSetup, Coin coin) throws Exception {
        System.out.println("Accepted the coin!");
        vendingMachineSetup.getCoinList().add(coin);
    }

    @Override
    public void clickOnProductSelectButton(VendingMachineSetup vendingMachineSetup) throws Exception {
        vendingMachineSetup.setState(new selectionState());
    }

    @Override
    public void selectProduct(VendingMachineSetup vendingMachineSetup,int productCode) throws Exception {
        throw new Exception("Product Selection is not allowed");
    }

    @Override
    public Item dispenseProduct(VendingMachineSetup vendingMachineSetup,int code) throws Exception {
        throw new Exception("dispense product is not allowed");
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        throw new Exception("Get Change is not allowed");
    }

    @Override
    public List<Coin> fullRefund(VendingMachineSetup vendingMachineSetup) throws Exception {
        System.out.println("Collect full refund from the tray!");
        vendingMachineSetup.setState(new IdleState());
        return vendingMachineSetup.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachineSetup vendingMachineSetup, Item item, int codeNumber) throws Exception {
        throw new Exception("Product update is allowed in idle state!");
    }
}
