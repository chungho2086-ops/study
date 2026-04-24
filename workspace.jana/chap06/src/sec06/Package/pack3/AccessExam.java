package sec06.Package.pack3;

import sec06.Package.pack1.Edu;
import sec06.Package.pack2.Access2;

public class AccessExam {

	public static void main(String[] args) {
		
		// public이 아니어서 생성 못함
//		new Access1();
		
		Access2 a2 = new Access2();
		Edu edu = new Edu();
        
//		a2.b1 = 10;
		a2.p1 = 100;
		
//	    a2.d();
		a2.p();
		
		// public이 없는 Class
		// import 조차 안됨
//		Access3 a3 = new Access3();
		
//		a2.hp = 10;
	}

}
