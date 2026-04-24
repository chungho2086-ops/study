package quiz.quzi1;

public class Pokemon {

	 String name;     
	    int attack;      
	    int defense;     
	    int hp; 
	    
	    Pokemon(String name, int attack, int defense, int hp) {
	        this.name = name;
	        this.attack = attack;
	        this.defense = defense;
	        this.hp = hp;
	    }
	    
	    void damaged(int attackPower) {

	        int damage = attackPower - defense;

	        if (damage < 0) {
	            damage = 0;
	        }

	        hp -= damage;

	        if (hp < 0) {
	            hp = 0;
	        }

	        System.out.println(
	            name + " 데미지 " + damage + 
	            " → 남은 체력: " + hp
	        );
	    }

	    boolean isDead() {
	        return hp == 0;
	    }

}
