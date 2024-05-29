package rpgGame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�÷��̾� �̸��� �Է��ϼ���:");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, 100, 10, 5);
        Monster monster = new Monster("���", 50, 8, 2);

        Weapon sword = new Weapon("��ö�� ��", 15);
        Armor shield = new Armor("����", 5);

        player.equipWeapon(sword);
        player.equipArmor(shield);

        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster);
            if (monster.isAlive()) {
                monster.attack(player);
            } else {
                System.out.println("�÷��̾  " + monster.name + "���� �¸��߽��ϴ�.!");
            }

            if (!player.isAlive()) {
                System.out.println("�÷��̾" + monster.name + "���� �й��߽��ϴ�.!");
            }
        }

        scanner.close();
    }
}

