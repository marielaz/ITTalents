package products;

public class Dessert extends Product {

	enum DessertType { ICE_CREAM, OREO_CAKE, CHEESECAKE };
	
	private DessertType dessertType;
	
	public Dessert(String name, double price, DessertType dessertType) {
		super(name, price);
		this.dessertType = dessertType;
	}

	
}
