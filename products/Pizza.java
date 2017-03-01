package products;

public class Pizza extends Product implements Discountable {

	enum Type { TRADITIONAL, THIN_AND_CRISPY, FLUFFY };
	enum Size { SMALL, MEDIUM, LARGE };
	
	private Type type;
	private Size size;
	
	public Pizza(String name, double price, Type type, Size size) {
		super(name, price);
		this.type = type;
		this.size = size;
	}
	
	@Override
	public int getDiscount() {
		return 5;
	}

}
