package logic;

public class OrderItem {
    Item item;
    int itemAmount;
    public  OrderItem(Item item, int itemAmount) {
        setItem(item);
        setItemAmount(itemAmount);
    }

    public void increaseItemAmount(int amount){
        if(amount < 0){
            return;
        }
        itemAmount += amount;
    }

    public int calculateTotalPrice(){
        int price;
        price = getItem().getPricePerPiece()*getItemAmount();
        return price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemAmount() {return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        if(itemAmount < 0){
            this.itemAmount = 0;
            return;
        }
        this.itemAmount = itemAmount;
    }
}
