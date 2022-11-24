package lld.VendingMachineDesign.MachineState;

import lld.VendingMachineDesign.Coin;
import lld.VendingMachineDesign.Item;
import lld.VendingMachineDesign.VendingMachineSetup;

import java.util.List;

public class selectionState implements State{
    public selectionState() {
        System.out.println("You can select any item!");
    }

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
    public void selectProduct(VendingMachineSetup vendingMachineSetup,int productCode) throws Exception {
        Item item = vendingMachineSetup.getInventory().getItem(productCode);

        int userPaid = 0;
        for(Coin coin: vendingMachineSetup.getCoinList()){
            userPaid += coin.amount;
        }

        if(userPaid< item.getPrice()){
            fullRefund(vendingMachineSetup);
            throw  new Exception("You paid less");
        } else if (userPaid>item.getPrice()) {
            getChange(userPaid-item.getPrice());
            vendingMachineSetup.setState(new dispenseState());
        }
    }

    @Override
    public Item dispenseProduct(VendingMachineSetup vendingMachineSetup,int code) throws Exception {
        throw new Exception("Product dispense is not allowed");
    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        System.out.println("Collect the change from the tray");
        return changeMoney;
    }

    @Override
    public List<Coin> fullRefund(VendingMachineSetup vendingMachineSetup) throws Exception {
        System.out.println("Collect full refund from the tray!");
        vendingMachineSetup.setState(new IdleState());
        return vendingMachineSetup.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachineSetup vendingMachineSetup, Item item, int codeNumber) throws Exception {
        throw new Exception("Product update is not allowed");
    }
}
