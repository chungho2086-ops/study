package quiz.quzi1;

public class Excution {
	
	void run(Item item) {
		System.out.println(item.getName() + " 생산을 완료 했습니다");
	}

	public static void main(String[] args) {
		
		Item item1 = new Item("콜라");
		Item item2 = new Item("사이다");
		
		Excution exe = new Excution();
		
		exe.run(item1);
		exe.run(item2);
	}

}
