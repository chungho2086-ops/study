package quiz.quzi2;

public class PlayerInfo {

    String name;
    int level;
    int attack;
    int defense;
    int hp;
    int areaIdx;

    java.util.Scanner sc = new java.util.Scanner(System.in);
    java.util.Random rand = new java.util.Random();

    PlayerInfo(String name, int level) {
        this.name = name;
        this.level = level;
        this.attack = 10;
        this.defense = 5;
        this.hp = 100;
        this.areaIdx = 0;
    }

    void levelUp() {
        level++;
        attack += 5;
        defense += 3;
        hp += 20;
        System.out.println("레벨업! 현재 레벨: " + level);
    }

    void printStatus() {
        System.out.println("\n[플레이어 상태]");
        System.out.println("이름: " + name);
        System.out.println("레벨: " + level);
        System.out.println("공격력: " + attack);
        System.out.println("방어력: " + defense);
        System.out.println("체력: " + hp);
    }
}
