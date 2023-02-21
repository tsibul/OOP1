package vendingMachine;

import product.HotDrink;
import product.Product;

import java.util.ArrayList;

public class HotVendingMachine extends DrinkVendingMachine{

    public ArrayList<Product> getProducts(String lookUp, float vol, int tmpr) {
        ArrayList<Product> findDrinks = new ArrayList<>();
        for (Product pr: goods) {
            if (pr instanceof HotDrink) {
                HotDrink ht = (HotDrink) pr;
                if (lookUp.equals(ht.getName()) && vol == ht.getVolume() && tmpr == ht.getTemperature()) {
                    findDrinks.add(ht);
                }
            }
        }
        return findDrinks;
    }
}
