package com.example.ioana.shoesshop;

/**
 * Created by Ioana on 11.03.2017 г..
 */

public abstract class WomanShoesActivity extends Shoes {

    public static class SportWoman extends WomanShoesActivity{
        public SportWoman(String name, String color, int size, double price, String description) {
            super(name, color, size, price, description);
        }

        @Override
        public String getName() {
            return this.getName();
        }
    }

    public static class FormalWoman extends WomanShoesActivity {
        private double heelSize;
        public FormalWoman(String name, String color, int size, double price, double heelSize, String description) {
            super(name, color, size, price, description);
            if(heelSize>0 && heelSize<=30){
                this.heelSize = heelSize;
            }
            else{
                this.heelSize = 0;
            }
        }
        @Override
        public String getName() {
            return this.getName();
        }
    }

    public static class DailyWoman extends WomanShoesActivity{
        public DailyWoman(String name, String color, int size, double price, String description) {
            super(name, color, size, price, description);
        }

        @Override
        public String getName() {
            return this.getName();
        }
    }

    public WomanShoesActivity(String name, String color, int size, double price, String description) {
        super(name, Type.WOMAN, color, price, description);
        if(size>=36 && size<=41){
            super.setSize(size);
        }
        else{
            super.setSize(35);
        }
    }

}
