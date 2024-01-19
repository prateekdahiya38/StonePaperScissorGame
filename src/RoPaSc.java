import Controller.GameController;
import Exceptions.InvalidMatchesCountException;
import Models.Bot;
import Models.Game;
import Models.Player;

import java.util.Scanner;

public class RoPaSc {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("Enter the name of the Player: ");
        String playerName = sc.next();
        Player player = new Player(playerName);


        System.out.println("Enter the name of the Bot: ");
        String botName = sc.next();
        Bot bot = new Bot(botName);

        System.out.println("Enter the matches you want to play in Tournament,enter only odd numbers: ");
        int matchCount = sc.nextInt();
        if (matchCount%2 == 0){
            throw new InvalidMatchesCountException("Please enter the odd numbers");
        }


        Game game = gameController.createGame(player,bot);
        gameController.executeGame(game,matchCount);
    }
}
