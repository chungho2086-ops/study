package quiz.quzi1;

public class Cafe {

	String name;
	String coffeeType;
	String detaiIType;
	String option;
	
	int price;
	int tota1price;
	
	Cafe(String name) {
		this.name = name;
		reset();
	}
	
	void reset() {
		coffeeType = "";
		detaiIType = "";
		option = "";
		price = 0;
		tota1price = 0;
	}
	
	void selectCoffeeType(int choice) {
		if (choice == 1) {
			coffeeType = "아메리카노";
		} else if (choice == 2) {
			coffeeType = "카푸치노";
		}
	}
	
	void selectDetaiIType(int choice) {
		if (coffeeType.equals("아메리카노")) {
			if (choice == 1) {
				detaiIType = "아이스";
				price += 4500;
			} else if (choice == 2) {
				detaiIType = "따뜻한";
				price +=5500;
			}
		}
		
	}
	
	void selectOption(int choice) {
		if (choice == 1) {
			option = "2샷 추가해주세요";
			price += 300;
		} else if (choice == 2) {
			option = "시럽추가해주세요";
		} else {
			option = "없음";
			
		}
	}
	
	void printOrder() {
		System.out.println("=======주문이 확인되었습니다==========");
		System.out.println("커피 : " + coffeeType );
		System.out.println("상세 : " + detaiIType );
		System.out.println("옵션 : " + option);
		System.out.println("가격 : " + price + "원" );
	}
	
	int getTota1price() {
		tota1price = price;
		return tota1price;
      }
		
	}

































