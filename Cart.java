import java.util.ArrayList;

import products.Product;

public class Cart {

	private ArrayList<Product> products;
	private double totalSum;
	private Client client;
	
	
	public void addProduct(Product p){
		if(!this.products.contains(p)){
			this.products.add(p);
			p.setQuantity(p.getQuantity()+1);

		}
		p.setQuantity(p.getQuantity()+1);
	}
	
	public void removeProduct (Product p){
		if(this.products.contains(p)){
			this.products.remove(p);
		}
		return;
	}
}
