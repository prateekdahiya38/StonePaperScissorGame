package Models;


import java.util.Random;

public class Game {

   private Bot bot;
   private Player player;
   private int playerWinCount;
   private int botWinCount;




    public void executeMove(int noOfMatches){
        for (int i=0; i<noOfMatches; i++){
            int compMove = bot.BotMove();
            int playerMove = player.PlayerMove();

            checkMove(compMove,playerMove);
        }
        checkWinner();
    }



    private void checkMove(int compMove,int playerMove){
        if ((compMove == 1 && playerMove == 2) || (compMove == 3 && playerMove == 1) || (compMove == 2 && playerMove == 3)){
            player.playerInputDisplay();
            bot.botInputDisplay();
            System.out.println(player.getName() +" Win");
            playerWinCount++;
        }else if (compMove == playerMove){
            player.playerInputDisplay();
            bot.botInputDisplay();
            System.out.println("Its A Draw");
        }else {
            player.playerInputDisplay();
            bot.botInputDisplay();
            System.out.println(bot.getName() +" Win");
            botWinCount++;
        }
    }



    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    private void checkWinner(){
        if (playerWinCount > botWinCount){
            System.out.println("########### " +player.getName() +" Win the Tournament ##########");
        }else if (playerWinCount == botWinCount){
            System.out.println("########## The Tournament is drawn ##########");
        }else {
            System.out.println("########## "+ bot.getName() + "Win the Tournament ##########");
        }
    }
}
