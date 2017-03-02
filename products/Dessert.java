package products;

public class Dessert extends Product {

	enum DessertType {
		CHOCO_PIE(6.5), SOUFFLE(6.5), NIRVANA(2.9), MINI_PANCAKES(3.5);

		private double price;

		private DessertType(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}

	};

	private DessertType dessertType;

	public Dessert(String name, DessertType dessertType) {
		super(name, dessertType.getPrice());
		this.dessertType = dessertType;
	}

}
