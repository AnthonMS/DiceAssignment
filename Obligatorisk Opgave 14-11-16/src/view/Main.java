/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import control.Game;
import model.Player;

/**
 *
 * @author Anthon
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean play = true;
        boolean playAgain = false;
        int choice = 0;
        int choice1 = 0;

        Player player = Player.getPlayer();

        System.out.print("Please enter your name: ");
        player.setPlayerName(scan.nextLine());

        // From here is still in progress.
        while (play)
        {
            boolean choiceIsValid = false;
            
            while (!playAgain && !choiceIsValid)
            {
                System.out.println("Hello " + player.getPlayerName() + " Which game would you like to play? ");
                System.out.println("1: Game 1.");
                System.out.println("2: Game 2.");
                System.out.println("3: Game 3.");
                System.out.println("4: QUIT");

                try
                {
                    String input = scan.nextLine();
                    choice = Integer.parseInt(input);
                    choiceIsValid = (choice > 0 && 5 > choice);
                } catch (NumberFormatException ex)
                {
                    System.out.println("Invalid input, please choose a number.");
                    choiceIsValid = false;
                }   
            }

            switch (choice)
            {
                case 1:
                    Game game1 = new Game();
                    game1.playGame1();
                    break;
                case 2:
                    Game game2 = new Game();
                    game2.playGame2();
                    break;
                case 3:
                    Game game3 = new Game();
                    game3.playGame3();
                    break;
                case 4:
                    System.out.println("Exiting... Please come again.");
                    play = false;
                    playAgain = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            
            choiceIsValid = false;
            
            while (play && !choiceIsValid)
            {
                System.out.println("Would you like to play again? Yes - 1 No - 2");

                try
                {
                    String input = scan.nextLine();
                    choice1 = Integer.parseInt(input);
                } catch (NumberFormatException ex)
                {
                    System.out.println("Invalid input, please choose a number.");
                    continue;
                }
                
                choiceIsValid = true;
                
                switch (choice1)
                {
                    case 1:
                        System.out.println("You pressed yes.");
                        playAgain = true;
                        break;
                    case 2:
                        System.out.println("You pressed No.");
                        playAgain = false;
                        break;
                    default:
                        System.out.println("You need to press either 1 or 2.");
                        choiceIsValid = false;
                        break;
                }
            }
        }
    }
}
