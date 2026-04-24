package sec04_retyrn03;

public class CarExam01 {

	public static void main(String[] args) {
		
		Car car = new Car();
		boolean status = car.isLeftgas();
		System.out.println("가스 남았냐? :"+ status);
		
		car.gas = 3;
		car.setGas(3); // 같은 일을 한다
		System.out.println("가스 남았냐?: "+ car.isLeftgas());
		
		car.run();
		System.out.println("4885 운행을 종료합니다");
	}

}
