package com.example.ioana.projectshoesshop;

/**
 * Created by Ioana on 11.03.2017 г..
 */
import java.util.ArrayList;
import java.util.HashSet;
public class Shop {
    private String name;
    private Administrator admin;
    HashSet<User> users;
    ArrayList<Buyable> availability;
    private Shop(String name){
        this.users = new HashSet<>();
        this.availability = new ArrayList<>();
        if(name!=null && !name.isEmpty()){
            this.name = name;
        }
        else{
            this.name = "Shoes Shop";
        }
    }
    //The Singleton pattern
    private static Shop instance;
    public static Shop getInstace(String name){
        if(instance == null){
            instance = new Shop(name);
        }
        return instance;
    }
    public void addAdministrator(Administrator a){
        if(a!=null){
            this.admin = a;
        }
    }

    public void addUser(User user){
        for (User u: users) {
            if (user.equals(u)){
                break;
            }
            else{
                if(user != null){
                    this.users.add(user);
                }
            }
        }

    }



    public Administrator getAdmin() {
        return admin;
    }
    public void sellProduct(Buyable b){
        int i = 0;
        for (Buyable buy : availability) {
            if(b.equals(buy)){
                if(buy.getAvailability()>0){
                    i = buy.getAvailability()-1;
                    buy.setAvailability(i);
                }
                else{
                    System.out.println("No availability");
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Shop [name=" + name + ", admin=" + admin + "]";
    }

    public void addProd(Buyable buy){
        if(buy != null){
            this.availability.add(buy);
        }
    }
}
