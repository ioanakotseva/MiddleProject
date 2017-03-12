package com.example.ioana.shoesshop;

/**
 * Created by Ioana on 11.03.2017 г..
 */

public abstract class ManShoesActivity extends Shoes {

    public static class SportMan extends ManShoesActivity {
        private boolean isWaterProof;
        public SportMan(String name, String color, int size, double price, String description, boolean isWaterProof) {
            super(name, color, size, price, description);
            this.isWaterProof = isWaterProof;
        }
        @Override
        public String getName() {
            return this.getName();
        }
    }
    public static class FormalMan extends ManShoesActivity {
        private boolean snakeSkin;
        public FormalMan(String name, String color, int size, double price, String description, boolean snakeSkin) {
            super(name, color, size, price, description);
            this.snakeSkin=snakeSkin;
        }
        @Override
        public String getName() {
            return this.getName();
        }
    }
    public static class DailyMan extends ManShoesActivity {
        public DailyMan(String name, String color, int size, double price, String description) {
            super(name, color, size, price, description);
        }

        @Override
        public String getName() {
            return this.getName();
        }
    }

    public ManShoesActivity(String name, String color, int size, double price, String description) {
        super(name, Type.MAN, color, price, description);
        if(size>40 && size<=52){
            super.setSize(size);
        }
        else{
            super.setSize(35);
        }
    }

}
