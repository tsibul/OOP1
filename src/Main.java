import product.Drink;
import product.HotDrink;
import product.Product;
import vendingMachine.HotVendingMachine;
import vendingMachine.VendingMachine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> goods = new ArrayList<>();
        ArrayList<HotDrink> goodsHot = new ArrayList<>();

        goods.add(new Product("vodka", 10));
        goods.add(new Product("beer", 11));
        goods.add(new Drink("sardines", 142,11));
        goods.add(new Drink("sardines", 142,11));
        goods.add(new HotDrink("tea", 55, 200, 85));
        goods.add(new HotDrink("espresso", 80, 80, 85));
        goods.add(new HotDrink("latte", 120, 350, 60));
        goods.add(new HotDrink("latte", 180, 350, 60));


        goodsHot.add(new HotDrink("tea", 55, 200, 85));
        goodsHot.add(new HotDrink("espresso", 80, 80, 85));
        goodsHot.add(new HotDrink("latte", 120, 350, 60));
        goodsHot.add(new HotDrink("latte", 180, 350, 60));
        VendingMachine vm = new VendingMachine();
        HotVendingMachine hvm = new HotVendingMachine();
        vm.setGoods(goods);
        hvm.setGoods(goodsHot);

        ArrayList<HotDrink> hdrss = hvm.getProducts("latte", 350, 60);
        for(Product prod: hdrss){
                System.out.println(prod.toString());
            }

    }
}