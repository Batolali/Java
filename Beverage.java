package supermarket.products;

public class Beverage extends GroceryProduct {
    private SugarLevel sugarLevel;

    public Beverage(String name, double price, double discount, SugarLevel sugarLevel) {
        super(name, price, discount);
        this.sugarLevel = sugarLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sugar Level: " + sugarLevel;
    }
}
