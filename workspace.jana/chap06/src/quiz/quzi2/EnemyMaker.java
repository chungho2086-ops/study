package quiz.quzi2;

public class EnemyMaker {

    java.util.Random rand = new java.util.Random();

    EnemyUnit makeEnemy(int playerLevel) {
        int level = playerLevel;
        int attack = 8 + (int)(level * 1.25);
        int defense = 4 + level;
        int hp = 50 + level * 15;

        return new EnemyUnit("야생 몬스터", level, attack, defense, hp);
    }
}
