package quiz.quzi2;

public class GameStart {

    public static void main(String[] args) {

        PlayerInfo player = new PlayerInfo("검사", 1);
        WorldArea world = new WorldArea();
        EnemyMaker maker = new EnemyMaker();
        FightSystem fight = new FightSystem();

        System.out.println("플레이어 이름: " + player.name);
        System.out.println("현재 위치: " + world.getAreaName(player.areaIdx));

        while (true) {
            System.out.println("\n1. 이동");
            System.out.println("2. 상태 확인");
            System.out.println("0. 종료");

            int sel = player.sc.nextInt();

            if (sel == 0) {
                System.out.println("게임 종료");
                break;
            }

            if (sel == 2) {
                player.printStatus();
                continue;
            }

            if (sel == 1) {
                System.out.println("이동 중");

                if (player.rand.nextInt(100) < 70) {
                    EnemyUnit enemy = maker.makeEnemy(player.level);
                    System.out.println("몬스터 등장: " + enemy.name);

                    boolean win = fight.battle(player, enemy);

                    if (win) {
                        player.levelUp();
                        if (player.level >= 3 && player.areaIdx == 0) {
                            player.areaIdx++;
                            System.out.println("새 지역으로 이동 가능!");
                        }
                    }
                } else {
                    System.out.println("무슨일일까?.");
                }
            }
        }
    }
}

