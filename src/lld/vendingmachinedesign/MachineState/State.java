package lld.vendingmachinedesign.MachineState;

import lld.vendingmachinedesign.Coin;
import lld.vendingmachinedesign.Item;
import lld.vendingmachinedesign.VendingMachineSetup;

import java.util.List;

public interface State {

    void clickOnInsertButton(VendingMachineSetup vendingMachineSetup) throws Exception;

    void insertCoin(VendingMachineSetup vendingMachineSetup, Coin coin) throws Exception;

    void clickOnProductSelectButton(VendingMachineSetup vendingMachineSetup) throws Exception;

    void selectProduct(VendingMachineSetup vendingMachineSetup, int productCode) throws Exception;

    Item dispenseProduct(VendingMachineSetup vendingMachineSetup,int code) throws Exception;

    int getChange(int changeMoney) throws Exception;

    List<Coin> fullRefund(VendingMachineSetup vendingMachineSetup) throws Exception;

    void updateInventory(VendingMachineSetup vendingMachineSetup, Item item, int codeNumber ) throws Exception;
}
