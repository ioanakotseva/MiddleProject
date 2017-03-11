package com.example.ioana.projectshoesshop;

/**
 * Created by Ioana on 11.03.2017 г..
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Administrator extends Information{

    HashMap<User, ArrayList<Buyable>> orders;

    private Administrator(String firstName, String lastName, int age, String phoneNumber, String email, String password) {
        super(firstName, lastName, age, phoneNumber, email, password);
        this.orders = new HashMap<>();
    }

    private static Administrator adminInstance;
    public static Administrator getInstance(String firstName, String lastName, int age, String phoneNumber, String email, String password){
        if(adminInstance == null){
            adminInstance = new Administrator(firstName, lastName, age , phoneNumber, email, password);
        }
        return adminInstance;
    }

    public void addNewProduct(Buyable b){
        shop.addProd(b);
    }

    public void sendProducts(){
        for (Map.Entry<User, ArrayList<Buyable>> entry : orders.entrySet()) {
            User user = entry.getKey();
            ArrayList<Buyable> list = entry.getValue();
            for (Buyable b : list) {
                shop.sellProduct(b);
            }
        }
        System.out.println("All products are send");
    }

    public void addInOrders(User u, ArrayList<Buyable> list){
        this.orders.put(u, list);
    }
}
