package sec02.quiz1;

public class BattleExam {

	public static void main(String[] args) {
		
		// 캐릭터 2명 생성
		Warrior w = new Warrior("전사");
		Wizard m = new Wizard("마법사");
		
		// 이제 슬슬 전투를 준비해보자
		Battle battle = new Battle();
		
		// 자 이제 전투에 드가자~~~!!!
		String winner = battle.fight(w, m);
		
		// 승리자를 가려보자
		System.out.println("승리자 : " + winner);
	}

}
