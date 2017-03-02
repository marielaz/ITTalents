package products;

public class Drink extends Product {

	enum DrinkType {
		COLA(2.8), FANTA(2.8), SPRITE(2.8), NESTEA(2);

		private double price;

		private DrinkType(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}

	};

	private DrinkType drinkType;

	public Drink(String name, DrinkType drinkType) {
		super(name, drinkType.getPrice());
		this.drinkType = drinkType;
	}

}

