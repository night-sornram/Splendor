package gem;

public class Gem {
    private int quantity;

    public Gem() {
        setQuantity(0);
    }

    public Gem(int quantity){
        setQuantity(quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(0,quantity);
    }
}
