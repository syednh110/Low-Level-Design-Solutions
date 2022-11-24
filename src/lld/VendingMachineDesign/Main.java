package lld.VendingMachineDesign;

import lld.VendingMachineDesign.MachineState.State;

public class Main {

    public static void main(String[] args) {
        VendingMachineSetup vendingMachineSetup = new VendingMachineSetup();
        try{
            System.out.println("filling up the inventory");

            fillUpInventory(vendingMachineSetup);
            displayInventory(vendingMachineSetup);

            System.out.println("clicking on InsertCoinButton");

            State vendingState = vendingMachineSetup.getState();
            vendingState.clickOnInsertButton(vendingMachineSetup);

            vendingState = vendingMachineSetup.getState();
            vendingState.insertCoin(vendingMachineSetup,Coin.NICKEL);
            vendingState.insertCoin(vendingMachineSetup, Coin.QUARTER);

            System.out.println("clicking on ProductSelectionButton");
            vendingState.clickOnProductSelectButton(vendingMachineSetup);

            vendingState = vendingMachineSetup.getState();
            vendingState.selectProduct(vendingMachineSetup,102);

            vendingState = vendingMachineSetup.getState();
            vendingState.dispenseProduct(vendingMachineSetup,102);

            displayInventory(vendingMachineSetup);
        }
        catch (Exception e){
            displayInventory(vendingMachineSetup);
        }
    }

    private static void displayInventory(VendingMachineSetup vendingMachineSetup) {
        ItemShelf[] itemShelves = vendingMachineSetup.getInventory().getItemShelves();
        for(int i=0;i<itemShelves.length;i++){
            System.out.println("Code Name: "+ itemShelves[i].getCode()
            + " Iteam Type " + itemShelves[i].getItem().getItemType()
            + " Item Price " + itemShelves[i].getItem().getPrice()
            + " Is Available " + !itemShelves[i].isSoldOut());
        }
    }

    private static void fillUpInventory(VendingMachineSetup vendingMachineSetup) {
        ItemShelf[] itemShelves = vendingMachineSetup.getInventory().itemShelves;
        for (int i=0;i< itemShelves.length;i++){
            Item newItem = new Item();
            if(i>=0 && i<3){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(10);
            }
            else if (i>=3 && i<6){
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i>=6 && i<8) {
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(14);
            } else if(i>=8 && i<10){
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(8);
            }
            itemShelves[i].setItem(newItem);
            itemShelves[i].setSoldOut(false);
        }
    }
}
