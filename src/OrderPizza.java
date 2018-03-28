public class OrderPizza {

	String name;
	int quantity;
	int price;
	public OrderPizza(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int totalPrice(){
		int total;
		total=getQuantity()*getPrice();
		return total;
	}
	public void printDetail(){
		
		System.out.println(getName()+"	   "+getQuantity()+"	        "+getPrice()+"	  "+totalPrice());
	}
	
	}










