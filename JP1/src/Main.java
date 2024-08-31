import Jp1.CreatePlayer;
import Jp1.FootballPlayer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballPlayer> players = CreatePlayer.createPlayers();
        for (FootballPlayer player : players) {
            System.out.println("Player name: " + player.name);
            System.out.println("Player shirt no: " + player.shirtNo);
            System.out.println("Player position: " + player.position);
            System.out.println("Player height: " + player.height);
            System.out.println("Player weight: " + player.weight);
            System.out.println("Player age: " + player.age);

            player.shoot();
            player.pass();
            player.runFaster();
            player.jumpHigher();
            System.out.println("     ");
        }

    }
}