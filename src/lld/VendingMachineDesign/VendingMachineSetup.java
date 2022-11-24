package lld.VendingMachineDesign;

import lld.VendingMachineDesign.MachineState.IdleState;
import lld.VendingMachineDesign.MachineState.State;
import lld.VendingMachineDesign.MachineState.hasMoneyState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineSetup {

    Inventory inventory;
    private State state;
    private List<Coin> coinList;

    public VendingMachineSetup() {
        this.inventory = new Inventory(10);
        this.state = new IdleState();
        this.coinList = new ArrayList<>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
