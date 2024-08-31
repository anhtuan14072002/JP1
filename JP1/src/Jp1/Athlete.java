package Jp1;

public class Athlete extends HomoSapien{
    public Athlete(int weight, int height, int age) {
        super(weight, height, age);
    }
    public void runFaster(){
        System.out.println("run faster");
    }
    public void jumpHigher(){
        System.out.println("jump high");
    }
}
