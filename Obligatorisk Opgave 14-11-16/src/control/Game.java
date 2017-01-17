/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.GameResult;
import model.Player;
import model.Die;
import java.util.HashSet;

/**
 *
 * @author Anthon
 */
public class Game
{

    private Player player;
    private Player house = Player.getHouse();

    private GameResult gameResult;

//  ---------------------Game No. 1--------------------------
    public void playGame1()
    {
        house.setPoint(0);
        player = Player.getPlayer();
//        house = Player.getHouse();
//        house.setPlayerName("The House");
        player.setPoint(0);

        for (int i = 0; i < 10; i++)
        {
            Die playerDie = new Die(6);
            player.addPoint(playerDie.getValue());
        }

//        Die playerDie = new Die(6);
//        Die playerDie1 = new Die(6);
//        Die playerDie2 = new Die(6);
//        Die playerDie3 = new Die(6);
//        Die playerDie4 = new Die(6);
//        Die playerDie5 = new Die(6);
//        Die playerDie6 = new Die(6);
//        Die playerDie7 = new Die(6);
//        Die playerDie8 = new Die(6);
//        Die playerDie9 = new Die(6);
//
//        int playerPoint = playerDie.getValue() + playerDie1.getValue() + playerDie2.getValue() + playerDie3.getValue() + playerDie4.getValue()
//                + playerDie5.getValue() + playerDie6.getValue() + playerDie7.getValue() + playerDie8.getValue() + playerDie9.getValue();
//
//        player.setPoint(playerPoint);
        System.out.println("There has been thrown 10 6-sided dice for " + player.getPlayerName());
        System.out.println(player.getPlayerName() + ": " + player.getPoint());

        for (int i = 0; i < 10; i++)
        {
            Die die = new Die(6);
            house.addPoint(die.getValue());
        }

//        Die houseDie = new Die(6);
//        Die houseDie1 = new Die(6);
//        Die houseDie2 = new Die(6);
//        Die houseDie3 = new Die(6);
//        Die houseDie4 = new Die(6);
//        Die houseDie5 = new Die(6);
//        Die houseDie6 = new Die(6);
//        Die houseDie7 = new Die(6);
//        Die houseDie8 = new Die(6);
//        Die houseDie9 = new Die(6);
//
//        int housePoint = houseDie.getValue() + houseDie1.getValue() + houseDie2.getValue() + houseDie3.getValue() + houseDie4.getValue()
//                + houseDie5.getValue() + houseDie6.getValue() + houseDie7.getValue() + houseDie8.getValue() + houseDie9.getValue();
//
//        house.setPoint(housePoint);
        System.out.println("There has been thrown 10 6-sided dice for " + house.getPlayerName());
        System.out.println(house.getPlayerName() + ": " + house.getPoint());

        gameResult = new GameResult(player.getPoint(), house.getPoint(), player.getPlayerName(), house.getPlayerName());

        if (house.getPoint() < player.getPoint())
        {
//            String result = player.getPlayerName() + " Wins!";
            System.out.println(gameResult);
            System.out.println(player.getPlayerName() + " Wins!");
        } else
            if (player.getPoint() < house.getPoint())
            {
                System.out.println(gameResult);
                System.out.println(house.getPlayerName() + " Wins this round!");
            } else
            {
                System.out.println(gameResult);
                System.out.println("It's a tie! " + house.getPlayerName() + " keeps the money!");
            }

    }

//  -------------------------Game No. 2----------------------------------------
    public void playGame2()
    {
        house.setPoint(0);
        player = Player.getPlayer();
//        house = Player.getHouse();
        player.setPoint(0);

        for (int i = 0; i < 5; i++)
        {
            Die die12 = new Die(12);
            Die die24 = new Die(24);
            player.addPoint(die12.getValue() + die24.getValue());
        }

//        Die playerDie = new Die(12);
//        Die playerDie1 = new Die(12);
//        Die playerDie2 = new Die(12);
//        Die playerDie3 = new Die(12);
//        Die playerDie4 = new Die(12);
//        Die playerDie5 = new Die(24);
//        Die playerDie6 = new Die(24);
//        Die playerDie7 = new Die(24);
//        Die playerDie8 = new Die(24);
//        Die playerDie9 = new Die(24);
//
//        int playerPoint = playerDie.getValue() + playerDie1.getValue() + playerDie2.getValue() + playerDie3.getValue() + playerDie4.getValue()
//                + playerDie5.getValue() + playerDie6.getValue() + playerDie7.getValue() + playerDie8.getValue() + playerDie9.getValue();
//
//        player.setPoint(playerPoint);
        System.out.println("There has been thrown 5 12-sided & 24-sided dice for " + player.getPlayerName());
        System.out.println(player.getPlayerName() + ": " + player.getPoint());
        
        for (int i = 0; i < 5; i++)
        {
            Die die12 = new Die(12);
            Die die24 = new Die(24);
            house.addPoint(die12.getValue() + die24.getValue());
        }

//        Die houseDie = new Die(12);
//        Die houseDie1 = new Die(12);
//        Die houseDie2 = new Die(12);
//        Die houseDie3 = new Die(12);
//        Die houseDie4 = new Die(12);
//        Die houseDie5 = new Die(24);
//        Die houseDie6 = new Die(24);
//        Die houseDie7 = new Die(24);
//        Die houseDie8 = new Die(24);
//        Die houseDie9 = new Die(24);
//
//        int housePoint = houseDie.getValue() + houseDie1.getValue() + houseDie2.getValue() + houseDie3.getValue() + houseDie4.getValue()
//                + houseDie5.getValue() + houseDie6.getValue() + houseDie7.getValue() + houseDie8.getValue() + houseDie9.getValue();
//
//        house.setPoint(housePoint);

        System.out.println("There has been thrown 5 12-sided & 24-sided dice for " + house.getPlayerName());
        System.out.println(house.getPlayerName() + ": " + house.getPoint());

        if (player.getPoint() % 2 == 0)
        {
            player.setPoint(player.getPoint()*2);
            System.out.println(player.getPlayerName() + " rolled an even No. & had his points doubled!");
        }

        if (house.getPoint() % 2 == 0)
        {
            house.setPoint(house.getPoint()*2);
            System.out.println("The House rolled an even No. & had their points doubled!");
        }

        gameResult = new GameResult(player.getPoint(), house.getPoint(), player.getPlayerName(), house.getPlayerName());

        if (house.getPoint() < player.getPoint())
        {
            System.out.println(gameResult);
            System.out.println(player.getPlayerName() + " Wins!");
        } else
            if (house.getPoint() > player.getPoint())
            {
                System.out.println(gameResult);
                System.out.println(house.getPlayerName() + " Wins this round!");
            } else
            {
                System.out.println(gameResult);
                System.out.println("It's a Tie! " + house.getPlayerName() + " Keeps the money this time.");
            }

    }

//  ------------------------------Game No. 3-----------------------------------
    public void playGame3()
    {
        house.setPoint(0);
        player = Player.getPlayer();
//        house = new Player("The House", 0);
        player.setPoint(0);

        Die playerDie = new Die(6);
        Die houseDie = new Die(6);

        player.setPoint(playerDie.getValue());
        house.setPoint(houseDie.getValue());

        System.out.println("There has been thrown 1 6-sided die for " + player.getPlayerName());
        System.out.println(player.getPlayerName() + ": " + player.getPoint());
        System.out.println("There has been thrown 1 6-sided die for " + house.getPlayerName());
        System.out.println(house.getPlayerName() + ": " + house.getPoint());

        if (playerDie.getValue() < 4)
        {
            System.out.println(player.getPlayerName() + " rolled between 1-3 so you rolled a 12-sided die.");
            Die playerDie12 = new Die(12);
            player.setPoint(playerDie.getValue() + playerDie12.getValue());
            System.out.println(player.getPlayerName() + " has rolled " + playerDie.getValue() + " and " + playerDie12.getValue()
                    + " So total points: " + player.getPoint());
        } else
        {
            System.out.println(player.getPlayerName() + " rolled between 4-6, so you rolled a 10-sided die.");
            Die playerDie10 = new Die(10);
            player.setPoint(playerDie.getValue() + playerDie10.getValue());
            System.out.println(player.getPlayerName() + " has rolled " + playerDie.getValue() + " and " + playerDie10.getValue()
                    + " So total points: " + player.getPoint());
        }

        if (houseDie.getValue() < 4)
        {
            System.out.println(house.getPlayerName() + " rolled between 1-3, so we rolled a 12-sided die.");
            Die houseDie12 = new Die(12);
            house.setPoint(houseDie.getValue() + houseDie12.getValue());
            System.out.println(house.getPlayerName() + " has rolled " + houseDie.getValue() + " and " + houseDie12.getValue()
                    + "So total points: " + house.getPoint());
        } else
        {
            System.out.println(house.getPlayerName() + " rolled between 4-6, so we rolled a 10-sided die.");
            Die houseDie10 = new Die(10);
            house.setPoint(houseDie.getValue() + houseDie10.getValue());
            System.out.println(house.getPlayerName() + " has rolled " + houseDie.getValue() + " and " + houseDie10.getValue()
                    + "So total points: " + house.getPoint());
        }

        gameResult = new GameResult(player.getPoint(), house.getPoint(), player.getPlayerName(), house.getPlayerName());

        if (house.getPoint() < player.getPoint())
        {
            System.out.println(gameResult);
            System.out.println(house.getPlayerName() + " Wins this round!");
        } else
            if (house.getPoint() > player.getPoint())
            {
                System.out.println(gameResult);
                System.out.println(player.getPlayerName() + " Wins this round!");
            } else
            {
                System.out.println(gameResult);
                System.out.println("It's a Tie! " + house.getPlayerName() + " Keeps the money this time.");
            }

    }

}
