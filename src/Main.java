public class Main {
    public static void main(String[] args) {
        System.out.println("lets start the Tournament, Win atleast 3/5 Matches");
        int yourRes = 0;
        int compRes = 0;
        for (int i=0; i<5; i++){
            RoPaSc game = new RoPaSc();
            game.yourInput();
            game.result();
            yourRes += game.noOfWin;
            compRes += game.noOfCompWin;
            System.out.println("--------------------------------------------");
        }
        System.out.println("Your Total Win is " + yourRes);
        if (yourRes > compRes){
            System.out.println("You win the Tournament, CONGRATULATIONS");
        }else if (yourRes == compRes){
            System.out.println("Tournament is Draw, PLAY IT AGAIN");
        }else {
            System.out.println("You loose the Tournament, SORRY BETTER LUCK NEXT TIME");
        }
    }
}