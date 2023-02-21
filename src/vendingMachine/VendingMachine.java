package vendingMachine;

import product.Product;

import java.util.ArrayList;

public class VendingMachine <T extends Product>{
    protected ArrayList<T> goods;

    @Override
    public String toString() {
        String out = "";
        return out;
    }

    public ArrayList<T> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<T> goods) {
        this.goods = goods;
    }

    public ArrayList<T> getProducts(String lookUp) {
        ArrayList<T> findGoods = new ArrayList<>();
        for (T pr : goods) {
            if (lookUp.equals(pr.getName())) {
                findGoods.add(pr);
            }
        }
        return findGoods;
    }
}
