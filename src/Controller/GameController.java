package Controller;

import Models.Bot;
import Models.Game;
import Models.Player;

import java.util.List;

public class GameController {
     public Game createGame(Player player, Bot bot){
             Game game = new Game();
             game.setPlayer(player);
             game.setBot(bot);
             return game;
     }

     public void executeGame(Game game,int noOfMatches){
         game.executeMove(noOfMatches);
     }
}
