package Jp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePlayer {
    public static List<FootballPlayer> createPlayers() {
        List<FootballPlayer> players = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            System.out.println("Name football player: ");
            String name = sc.nextLine();

            System.out.println("Shirt no football player: ");
            int shirtNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Position football player: ");
            String position = sc.nextLine();

            System.out.println("Height football player (cm): ");
            int height = sc.nextInt();

            System.out.println("Weight football player (kg): ");
            int weight = sc.nextInt();

            System.out.println("Age football player: ");
            int age = sc.nextInt();

            sc.nextLine();

            FootballPlayer player = new FootballPlayer(weight, height, age, name, shirtNo, position);
            players.add(player);
        }

        return players;
    }
}
