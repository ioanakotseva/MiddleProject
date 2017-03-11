package shop;

public abstract class Shoes extends Product{

	enum Type {WOMAN, MAN};
	private Type type;
	private int size;
	
	public Shoes(String name, String color, String description, double price, int size) {
		super(name, color, description, price);
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setType(Type t){
		if(t != null){
			this.type = t;
		}
	}
	
}
