package vendingMachine;

import product.Product;

import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<Product> goods;

    @Override
    public String toString() {
        String out = "";
        return out;
    }

    public ArrayList<Product> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Product> goods) {
        this.goods = goods;
    }

    public ArrayList<Product> getProducts(String lookUp) {
        ArrayList<Product> findGoods = new ArrayList<>();
        for (Product pr : goods) {
            if (lookUp.equals(pr.getName())) {
                findGoods.add(pr);
            }
        }
        return findGoods;
    }
}
