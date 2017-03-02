
public class Client {

	private String username;
	private String name;
	private String address;
	private String password;
	private String phoneNumber;
	private Cart cart;
	private String email;
	private double money;
	
	public Client(String username, String name, String address, String password, String phoneNumber, String email) {
		super();
		this.username = username;
		this.name = name;
		this.address = address;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	public void makeOrder(Product p){
		this.cart.addProduct(p);
	}
	public void pay(){
		double payCheck = this.cart.getTotalSum();
		this.money -= payCheck;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney() {
		return money;
	}
}
