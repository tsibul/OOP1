package vendingMachine;

import product.HotDrink;
import product.Product;

import java.util.ArrayList;

public class HotVendingMachine extends VendingMachine<HotDrink>{

    public ArrayList<HotDrink> getProducts(String lookUp, float vol, int tmpr) {
        ArrayList<HotDrink> findDrinks = new ArrayList<>();
        for (Product pr: goods) {
            HotDrink ht = (HotDrink) pr;
            if (lookUp.equals(ht.getName()) && vol == ht.getVolume() && tmpr == ht.getTemperature()) {
                findDrinks.add(ht);
            }
        }
        return findDrinks;
    }
}
