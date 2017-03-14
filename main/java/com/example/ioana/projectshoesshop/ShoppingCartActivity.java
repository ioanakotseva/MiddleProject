package com.example.ioana.projectshoesshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class ShoppingCartActivity extends AppCompatActivity {

    private ArrayList<Product> products;
    private double price;
    private int numberOfProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingcart);
    }

    public ShoppingCartActivity() {
        this.products = new ArrayList<>();
        this.price = 0;
        this.numberOfProd=0;
    }

    public void addIn(Product b){
        this.products.add(b);
        this.price += b.getPrice();
        this.numberOfProd++;
    }
    public void remove(Product b){
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
