package quiz.quzi2;

public class FightSystem {

    boolean battle(PlayerInfo player, EnemyUnit enemy) {

        while (player.hp > 0 && enemy.hp > 0) {

            System.out.println("\n1. 공격");
            int sel = player.sc.nextInt();

            if (sel == 1) {
                int pDmg = player.attack - enemy.defense;
                if (pDmg < 1) pDmg = 1;
                enemy.hp -= pDmg;
                System.out.println("몬스터 HP: " + enemy.hp);

                if (enemy.hp <= 0) {
                    System.out.println("승리!");
                    return true;
                }

                int eDmg = enemy.attack - player.defense;
                if (eDmg < 1) eDmg = 1;
                player.hp -= eDmg;
                System.out.println("플레이어 HP: " + player.hp);
            }
        }

        System.out.println("패배...");
        player.hp = 100 + player.level * 10;
        return false;
    }
}