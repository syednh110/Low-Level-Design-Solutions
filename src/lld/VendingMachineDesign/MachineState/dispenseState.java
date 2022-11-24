package lld.VendingMachineDesign.MachineState;

import lld.VendingMachineDesign.Coin;
import lld.VendingMachineDesign.Item;
import lld.VendingMachineDesign.VendingMachineSetup;

import java.util.List;

public class dispenseState implements State{
    @Override
    public void clickOnInsertButton(VendingMachineSetup vendingMachineSetup) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachineSetup vendingMachineSetup, Coin coin) throws Exception {
        return;
    }

    @Override
    public void clickOnProductSelectButton(VendingMachineSetup vendingMachineSetup) throws Exception {
        return;
    }

    @Override
    public void selectProduct(VendingMachineSetup vendingMachineSetup, int productCode) throws Exception {
        return;
    }


    @Override
    public Item dispenseProduct(VendingMachineSetup vendingMachineSetup,int code) throws Exception {
        System.out.println("Product has been dispense!");
        Item item = vendingMachineSetup.getInventory().getItem(code);
        vendingMachineSetup.setState(new IdleState());
        vendingMachineSetup.getInventory().updateSoldOutItem(code);
        return item;
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        throw new Exception("Change already processed");
    }

    @Override
    public List<Coin> fullRefund(VendingMachineSetup vendingMachineSetup) throws Exception {
        throw new Exception("Not allowed!");
    }

    @Override
    public void updateInventory(VendingMachineSetup vendingMachineSetup, Item item, int codeNumber) throws Exception {
        throw new Exception("Not allowed");
    }
}
