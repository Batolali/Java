package supermarket.products;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Opprett en ArrayList for handlekurven
        ArrayList<GroceryProduct> cart = new ArrayList<GroceryProduct>();

        // Opprett et produkt (toast)
        GroceryProduct toast = new GroceryProduct("Toast", 2.5, 10);
        cart.add(toast);
        System.out.println("Toast price after discount: " + toast.getActualPrice());

        // Opprett et Beverage-produkt (Coke)
        Beverage coke = new Beverage("Coke", 1.5, 0, SugarLevel.LOW); // Bruk SugarLevel.LOW
        cart.add(coke);

        // Opprett et DairyProduct (Milk)
        DairyProduct milk = new DairyProduct("Milk", 4, 0, FatLevel.FULL_FAT); // Bruk FatLevel.FULL_FAT
        cart.add(milk);

        // Beregn totalen for handlekurven
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).getActualPrice();
        }

        // Skriv ut totalprisen
        System.out.println("The total cost = " + total);

        // Vis informasjon om hvert produkt
        for (GroceryProduct product : cart) {
            System.out.println(product.toString());
        }
    }
}
