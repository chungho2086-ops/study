package quiz.quzi1;

public class Product_User_Exam {

	public static void main(String[] args) {
		
		Product p1 = new Product("무선 마우스", 45000, "로지텍 무선 마우스");
		Product p2 = new Product("헤드셋", 35000, "로지텍 헤드셋");
		Product p3 = new Product("모니터", 135000, "35인치 모니터");
		
		User u1 = new User("user01");
		User u2 = new User("user02");
		
		u1.addCart(p1);
		u1.addCart(p2);
		
		u2.addCart(p2);
		u2.addCart(p3);
		
		u1.prinCart();
		u1.prinCart();
	}

}
