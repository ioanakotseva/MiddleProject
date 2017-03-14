package com.example.ioana.projectshoesshop;

import com.example.ioana.projectshoesshop.User;
import com.example.ioana.projectshoesshop.Product;
import com.example.ioana.projectshoesshop.ManShoes;
import com.example.ioana.projectshoesshop.WomanShoes.DailyWoman;
import com.example.ioana.projectshoesshop.WomanShoes.FormalWoman;
import com.example.ioana.projectshoesshop.WomanShoes.SportWoman;

public class Demo {

	public static void main(String[] args) {

		Shop shop = Shop.getInstace("Shoes Shop");
		
		Administrator admin = Administrator.getInstance("Ioana", "Kotseva", 20, "0895550175", "ioana.kotseva@gmail.com", "Yoana.kotseva96");
		shop.addAdministrator(admin);
		System.out.println(shop.toString());
		
		// Product kec = new SportWoman("Kec", "black", "Udobni za tichane!", 24.5, 38);
		// Product official = new FormalWoman("Qna", "black&red",  "Visok tok!", 52, 38, 12.4);
		// Product balerina = new DailyWoman("Balerinka", "red", "Podhodqshti za vseki den!", 32, 38);
		// Product maratonka = new SportMan("Nike Air", "blue&white", "Za tichane1!", 105, 43, true);
		// Product skin = new FormalMan("Skin Shoes", "brown", "Za oficialen sl!", 87.5, 43, false);
		// Product cubinka = new DailyMan("Kubinka", "yellow",  "Tejki i plytni!", 54, 43);
		// Product chanta = new Bags("Kali", "red", "Modern bag!", 45);
		// System.out.println("========================");

		// admin.addNewProduct(kec);
		// admin.addNewProduct(official);
		// admin.addNewProduct(balerina);
		// admin.addNewProduct(maratonka);
		// admin.addNewProduct(skin);
		// admin.addNewProduct(cubinka);
		// admin.addNewProduct(chanta);
		
		User diana = new User("Diana", "Kotseva", 26, "0895550173", "di.kotseva@gmail.com","Diana.kotseva90");
		User vladimir = new User("Vladimir", "Iv", 30, "0894216215", "ninjata_stunt@abv.bg","VladkataStunt.636");
		
		
		
		
		
		
	}

}
