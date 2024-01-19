package Models;

import Exceptions.InvalidPlayerInputException;

import java.util.Random;

public class Bot {
    private String name;
    private int num;

    public Bot(String name) {
        this.name = name;
    }

    public int BotMove(){
        Random random = new Random();
        num = random.nextInt(1,4);random.nextInt(1,4);
        return num;
    }

    public void botInputDisplay() {
        if (num == 1) {
            System.out.println(name + " select : Rock");
        } else if (num == 2) {
            System.out.println(name + " select : Paper");
        } else if (num == 3) {
            System.out.println(name + " select : Scissor");
        }
    }

    public String getName() {
        return name;
    }

}
