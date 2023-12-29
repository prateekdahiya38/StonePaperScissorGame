import java.util.Random;
import java.util.Scanner;

public class RoPaSc {
    public int compCall;
    public int yourCall;
    public int noOfWin;
    public int noOfCompWin;

    public RoPaSc(){
        Random num = new Random();
        compCall = num.nextInt(0,3);
    }


    public void yourInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE SELECT : Rock = (0), Paper = (1), Scissor = (2)");
        yourCall = sc.nextInt();

        yourChoicePrint(yourCall);
        if (yourCall<0 || yourCall>2) {
            while (!(yourCall>=0 && yourCall<3)) {
                System.out.println("Invalid input,Please try again");
                yourCall = sc.nextInt();
            }
            yourChoicePrint(yourCall);
        }
    }



    public void result(){
        if ((compCall == 2 && yourCall == 0) || (compCall == 0 && yourCall == 1) || (compCall == 1 && yourCall == 2)){
            System.out.println("You Win");
            compChoicePrint(compCall);
            noOfWin++;
        }else if (compCall == yourCall){
            System.out.println("Its A Draw");
            compChoicePrint(compCall);
        }else {
            System.out.println("You Loose");
            compChoicePrint(compCall);
            noOfCompWin++;
        }
    }

    private static void compChoicePrint(int compCall){
        if (compCall == 0){
            System.out.println("Computer Choice : Rock");
        }else if (compCall == 1){
            System.out.println("Computer Choice : Paper");
        }else {
            System.out.println("Computer Choice : Scissor");
        }
    }

    private static void yourChoicePrint(int yourCall){
        if (yourCall == 0){
            System.out.println("you choose : Rock");
        }else if (yourCall == 1){
            System.out.println("you choose : Paper");
        }else if (yourCall == 2){
            System.out.println("you choose : Scissor");
        }
    }
}