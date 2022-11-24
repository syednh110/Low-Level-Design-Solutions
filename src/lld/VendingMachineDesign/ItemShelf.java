package lld.VendingMachineDesign;

public class ItemShelf {
    private Item item;
    private int code;
    private boolean soldOut;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    @Override
    public String toString() {
        return "ItemShelf{" +
                "item=" + item +
                ", code=" + code +
                ", soldOut=" + soldOut +
                '}';
    }
}
