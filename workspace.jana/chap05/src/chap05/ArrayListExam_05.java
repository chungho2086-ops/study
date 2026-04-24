package chap05;

import java.util.ArrayList;

public class ArrayListExam_05 {

	public static void main(String[] args) {
		
		String[] menu = new String[3];
		menu[0] = "아아";
		menu[1] = "딸기라떼";
		menu[2] = "따뜻한 아이스티";
		
		// "딸기치즈케이크스무디"를 추가해서
		// 총 4개를 출력
		
		String[] menu2 = new String[menu.length+1];
//		menu2[0] = menu[0];
		for(int i=0; i<menu.length; i++) {
			menu2[i] = menu[i];
		}
		menu2[menu2.length-1] = "딸기치즈케이크스무디";
		
		ArrayList List = new ArrayList();
		
		// 추가
		List.add(1);
		List.add("글씨");
		List.add(true);
		
		// 사용
		System.out.println( List.get(0)); // 1
		System.out.println( List.get(1)); // 글씨
		System.out.println( List.get(2)); // true
		
		// 크기
		System.out.println(List.size());
		
		System.out.println(List);
		
		for(int i=0; i<List.size(); i++) {
			System.out.println( List.get(i) );
		}
		
		ArrayList<String> List2 = new ArrayList();
		List2.add("첫번째");
		List2.add("두번째");
		
		for(String s : List2) {
			System.out.println(s);
		}
		
		ArrayList List3 = new ArrayList();
		List3.add(1);
		List3.add(2);
	}

}
