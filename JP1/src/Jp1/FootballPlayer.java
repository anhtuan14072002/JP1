package Jp1;

import java.util.Scanner;

public class FootballPlayer extends Athlete{
    public String name;
    public int shirtNo;
    public String position;

    public FootballPlayer(int weight, int height, int age, String name, int shirtNo, String position) {
        super(weight, height, age);
        this.name = name;
        this.shirtNo = shirtNo;
        this.position = position;
    }

    public void shoot(){
        System.out.println("Cristiano Ronaldo is shooting a ball.");
    }
    public void pass(){
        System.out.println("Cristiano Ronaldo is passing to Messi.");
    }
}
