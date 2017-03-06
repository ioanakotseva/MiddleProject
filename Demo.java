package shop;

import shop.ManShoes.DailyMan;
import shop.ManShoes.FormalMan;
import shop.ManShoes.SportMan;
import shop.WomanShoes.DailyWoman;
import shop.WomanShoes.FormalWoman;
import shop.WomanShoes.SportWoman;

public class Demo {

	public static void main(String[] args) {
		 
		
		
		
		Shop shop = Shop.getInstace("Shoes Shop");
		
		Administrator admin = Administrator.getInstance("Ioana", "Kotseva", 20, "0895550175", "ioana.kotseva@gmail.com", "Yoana.kotseva96");
		shop.addAdministrator(admin);
		System.out.println(shop.toString());
		
		Buyable kec = new SportWoman("Kec", "black", 38, 24.5, "Udobni za tichane!");
		Buyable official = new FormalWoman("Qna", "black&red", 38, 52, 12.4, "Visok tok!");
		Buyable balerina = new DailyWoman("Balerinka", "red", 38, 32, "Podhodqshti za vseki den!");
		Buyable maratonka = new SportMan("Nike Air", "blue&white", 43, 105, "Za tichane1!", true);
		Buyable skin = new FormalMan("Skin Shoes", "brown", 43, 87.5, "Za oficialen sl!", false);
		Buyable cubinka = new DailyMan("Kubinka", "yellow", 43, 54, "Tejki i plytni!");
		Buyable chanta = new Bags("Kali", "red", 45, "Modern bag!");
		System.out.println("========================");
		
		admin.addNewProduct(kec);
		admin.addNewProduct(official);
		admin.addNewProduct(balerina);
		admin.addNewProduct(maratonka);
		admin.addNewProduct(skin);
		admin.addNewProduct(cubinka);
		admin.addNewProduct(chanta);
		User diana = new User("Diana", "Kotseva", 26, "0895550173", "di.kotseva@gmail.com","Diana.kotseva90");
		User vladimir = new User("Vladimir", "Iv", 30, "0894216215", "ninjata_stunt@abv.bg","VladkataStunt.636");
		
		diana.singUp();
		vladimir.singUp();
		
		
		
		diana.addInCart(official);
		diana.addInCart(balerina);
		vladimir.addInCart(skin);
		vladimir.addInCart(maratonka);
		
		diana.makeOrder();
		vladimir.makeOrder();
		
		admin.sendProducts();
	}

}
