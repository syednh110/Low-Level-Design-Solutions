package lld.vendingmachinedesign;

public class Inventory {
    ItemShelf[] itemShelves;

    public Inventory(int itemCount) {
        this.itemShelves = new ItemShelf[itemCount];
        initializeEmptyInventory();
    }

    private void initializeEmptyInventory() {
        int code=100;
        for(int i=0;i<itemShelves.length;i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(code++);
            itemShelf.setSoldOut(true);
            itemShelves[i] = itemShelf;
        }
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    public void addItem(Item item, int code) throws Exception{
        for(ItemShelf itemShelf:itemShelves){
            if(itemShelf.isSoldOut()){
                itemShelf.setItem(item);
                itemShelf.setSoldOut(false);
            }
            else{
                throw new Exception("Iteam already present in the shelf");
            }
        }
    }

    public Item getItem(int code) throws  Exception{
        for(ItemShelf itemShelf: itemShelves){
            if(itemShelf.getCode()==code){
                if(itemShelf.isSoldOut()){
                    throw new Exception("Item Sold out");
                }
                else{
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int code){
        for(ItemShelf itemShelf:itemShelves){
            if(itemShelf.getCode()==code)
                itemShelf.setSoldOut(true);
        }
    }
}
