package supermarket.products;

public class DairyProduct extends GroceryProduct {
    private FatLevel fatLevel;

    public DairyProduct(String name, double price, double discount, FatLevel fatLevel) {
        super(name, price, discount);
        this.fatLevel = fatLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fat Level: " + fatLevel;
    }
}
