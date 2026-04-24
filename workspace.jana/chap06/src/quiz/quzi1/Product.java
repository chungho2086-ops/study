package quiz.quzi1;

public class Product {

	String name;
	int price;
	String info;
	
	Product(String name, int price, String info) {
		this.name = name;
		this.price = price;
		this.info = info;
	}
	
	void prinProduct() {
		System.out.println("- " + name + " / " + price + "원");
		System.out.println("  " + info);
	}

}
