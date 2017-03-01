package products;

public class Drink extends Product {

	enum DrinkType { COLA, FANTA, SPRITE };
	
	private DrinkType drinkType;
	
	public Drink(String name, double price, DrinkType drinkType) {
		super(name, price);
		this.drinkType = drinkType;
	}

}
