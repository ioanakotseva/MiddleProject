package com.example.ioana.shoesshop;

/**
 * Created by Ioana on 11.03.2017 г..
 */

public class BagsActivity implements Buyable {
    private String name;
    private String color;
    private String text;
    private double price;
    private int availability;
    public BagsActivity(String name, String color, double price, String text){
        if(name!=null && !name.isEmpty()){
            this.name = name;
        }
        else{
            this.name = "Bag";
        }
        this.availability = 10;
        if(color!=null && !color.isEmpty()){
            this.color = color;
        }
        else{
            this.color = "black";
        }
        if(price>0){
            this.price = price;
        }
        else{
            this.price = 4;
        }
        if(text!=null && !text.isEmpty()){
            this.text = text;
        }
        else{
            this.text= "No Description!";
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAvailability() {
        return availability;
    }

    @Override
    public int setAvailability(int i) {
        this.availability = i;
        return this.availability;
    }
}
