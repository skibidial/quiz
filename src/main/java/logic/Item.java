package logic;

public class Item {
    String name;
    int PricePerPiece;

    public Item(String name, int pricePerPiece) {
        setName(name);
        setPricePerPiece(pricePerPiece);
    }
    public String getName() {
        return name;
    }
    public int getPricePerPiece() {
        return PricePerPiece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerPiece(int pricePerPiece) {
        if(pricePerPiece < 1 ) {
            this.PricePerPiece = 1;
            return;
        }
        PricePerPiece = pricePerPiece;
    }


}
