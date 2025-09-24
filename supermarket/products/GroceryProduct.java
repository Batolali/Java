package supermarket.products;

public class GroceryProduct {
    private String name;
    private double price;
    private double discount;

    // Constructor
    public GroceryProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Metode for å beregne den faktiske prisen etter rabatt
    public double getActualPrice() {
        return price - (price * discount / 100);
    }

    // Overstyr toString-metoden for å vise grunnleggende produktinformasjon
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Discount: " + discount + "%";
    }
}

