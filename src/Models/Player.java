package Models;

import Exceptions.InvalidPlayerInputException;

import java.util.Scanner;

public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    public int PlayerMove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE SELECT : Rock = (1), Paper = (2), Scissor = (3)");
        num = scanner.nextInt();
        return num;
    }

    public void playerInputDisplay(){
        if (num == 1){
            System.out.println(name + " select : Rock");
        }else if (num == 2){
            System.out.println(name + " select : Paper");
        }else if (num == 3){
            System.out.println(name + " select : Scissor");
        }else {
            throw new InvalidPlayerInputException("Input is wrong, Please enter the valid input");
        }
    }

    public String getName() {
        return name;
    }
}
