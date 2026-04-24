package quiz.quzi1;

public class User {

	String id;
	Product[] cart = new Product[5];
	int count = 0;
	
	User(String i) {
		id = i;
	}
	
	void addCart(Product p) {
		cart[count] = p;
		count++;
	}
	
	void prinCart() {
		System.out.println("===============");
		System.out.println("회원 ID : " + id);
		System.out.println("장바구니 목록");
		
		for (int i = 0; i < count; i++) {
			cart[i].prinProduct();
		}
		
		System.out.println("===============");
	}

}
