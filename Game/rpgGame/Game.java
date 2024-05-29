package rpgGame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("플레이어 이름을 입력하세요:");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, 100, 10, 5);
        Monster monster = new Monster("고블린", 50, 8, 2);

        Weapon sword = new Weapon("강철의 검", 15);
        Armor shield = new Armor("갑옷", 5);

        player.equipWeapon(sword);
        player.equipArmor(shield);

        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster);
            if (monster.isAlive()) {
                monster.attack(player);
            } else {
                System.out.println("플레이어가  " + monster.name + "에게 승리했습니다.!");
            }

            if (!player.isAlive()) {
                System.out.println("플레이어가" + monster.name + "에게 패배했습니다.!");
            }
        }

        scanner.close();
    }
}

