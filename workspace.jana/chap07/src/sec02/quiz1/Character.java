package sec02.quiz1;

public class Character {
	
	String name;
	int hp;
	int ap;
	int dp;
	
	Character(String name, int hp, int ap, int dp) {
	    this.name = name;
	    this.hp = hp;
	    this.ap = ap;
	    this.dp = dp;
	}
	
	int defense() {
		return dp;
	}
}
