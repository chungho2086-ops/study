package sec02.quiz1;

import java.util.Scanner;

public class Battle {
	
	String fight(Character c1, Character c2) {
		
		Scanner sc = new Scanner(System.in);
		
		while(c1.hp > 0 && c2.hp > 0) {
			
			// c1 공격
			System.out.println(c1.name + "공격력: ");
			int input1 = sc.nextInt();
			
			int damage1 = input1 + c1.ap - c2.defense();
			if(damage1 < 0) damage1 = 0;
			
			c2.hp -= damage1;
			
			System.out.println(c2.name + "현재 hp: " + c2.hp);
			
			if(c2.hp <= 0) {
				return c1.name;
			}
			
			// c2 공격
			System.out.println(c2.name + "공격력: ");
			int input2 = sc.nextInt();
			
			int damage2 = input2 + c2.ap - c1.defense();
			if(damage2 < 0) damage2 = 0;
			
			c1.hp -= damage2;
			
			System.out.println(c1.name + "현재 hp: " + c1.hp);
			
			if(c1.hp <= 0) {
				return c2.name;
			}
		}
		
		return "무승부";
	}
}	
