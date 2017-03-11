package com.example.ioana.projectshoesshop;

/**
 * Created by Ioana on 11.03.2017 г..
 */
import java.util.ArrayList;
public class CartActivity {
    ArrayList<Buyable> products;
    private double price;
    private int numberOfProd;

    public CartActivity() {
        this.products = new ArrayList<>();
        this.price = 0;
        this.numberOfProd=0;
    }

    public void addIn(Buyable b){
        this.products.add(b);
        this.price += b.getPrice();
        this.numberOfProd++;
    }
    public void remove(Buyable b){
        if(products.contains(b)){
            this.products.remove(b);
            this.numberOfProd--;
            this.price-=b.getPrice();
        }
    }
    public void clearAll(){
        this.products.clear();
    }
}
