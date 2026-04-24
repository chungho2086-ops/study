package quiz.quzi1;

public class PokemonExam {
	
	static void battle(Pokemon p1, Pokemon p2) {
		
		System.out.println("배틀 start");
		 System.out.println(p1.name + " VS " + p2.name);
		 
		 while (true) {
			 p2.damaged(p1.attack);
	            if (p2.isDead()) {
	                System.out.println( p1.name + " 승리");
	                break;
	            }
	            
	            p1.damaged(p2.attack);
	            if (p1.isDead()) {
	            	System.out.println(p2.name + "승리");
	            	break;
	            }
		 }
	}
	
	 public static void main(String[] args) {

	        Pokemon pikachu = new Pokemon("피카츄", 15, 6, 70);
	        Pokemon bulbasaur = new Pokemon("리자몽", 9, 6, 55);

	        battle(pikachu, bulbasaur);
	    }
}
