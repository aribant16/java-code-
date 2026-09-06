//BantonAAssignment2
//CSCI 1301
//9/21/21
                               
                               // Algorithm 
//use "do loop" to repeat game or not
////ask play to Enter valid input between 1 - 5
//Player 1 chooses -- "1", "2", "3", "4", or "5"
//Player 2 chooses -- "1", "2", "3", "4", or "5"
//use "if while" to create ranges between 1-5
// Use "nested ifs" statements to crate ranges
//See who won. 
//Use "if while" statement to ask players to play again or end game.*/

import java.util.Scanner;
public class MoropinzeeGame {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s;
        System.out.println("Hey, let's play Moropinzee!\n" + "Please enter a move. ");
        
        do {
              System.out.println("Player 1: Enter a move from 1-5 for Gorilla, Terminator, Gangster, Warrior or Zombie:");

            int p1 = stdin.nextInt();
            while (p1 < 1 || p1 > 5) {
                System.out.println("Invalid choice, Player 1. Enter a number 1-5:");
                p1 = stdin.nextInt();
            }
            
            System.out.println( "Player 2: Enter a move from 1-5 for Gorilla, Terminator, Gangster, Warrior or Zombie:");
            int p2 = stdin.nextInt();
            while (p2 < 1 || p2 > 5) {
                System.out.println("Invalid choice, Player 2. Enter a number 1-5:");
                p2 = stdin.nextInt();
            }

            if ((p1 == 1 && p2 == 4) || (p1 == 4 && p2 == 1)) {
                System.out.print("Gorilla fools Warrior. ");

                if (p1 == 1) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 1 && p2 == 2) || (p1 == 2 && p2 == 1)) {
                System.out.print("Gorilla unplugs Terminator. ");
                if (p1 == 1) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 2 && p2 == 4) || (p1 == 4 && p2 == 2)) {
                System.out.print("Terminator chokes Warrior. ");
                if (p1 == 2) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 2 && p2 == 5) || (p1 == 5 && p2 == 2)) {
                System.out.print("Terminator crushes Zombie. ");
                if (p1 == 2) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 3 && p2 == 2) || (p1 == 2 && p2 == 3)) {
                System.out.print("Gangster drowns Terminator. ");
                if (p1 == 3) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 3 && p2 == 1) || (p1 == 1 && p2 == 3)) {
                System.out.print("Gangster skewers Gorilla. ");
                if (p1 == 3) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 4 && p2 == 3) || (p1 == 3 && p2 == 4)) {
                System.out.print("Warrior chops Gangster. ");
                if (p1 == 4) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 4 && p2 == 5) || (p1 == 5 && p2 == 4)) {
                System.out.print("Warrior decapitates Zombie. ");
                if (p1 == 4) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 5 && p2 == 3) || (p1 == 3 && p2 == 5)) {
                System.out.print("Zombie eats Gangster. ");
                if (p1 == 5) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if ((p1 == 5 && p2 == 1) || (p1 == 1 && p2 == 5)) {
                System.out.print("Zombie savages Gorilla. ");
                if (p1 == 5) {
                    System.out.println("Player 1 wins!");
                } else {
                    System.out.println("Player 2 wins!");
                }
            } else if (p1 == p2) {
                System.out.println("Nobody wins!");
            }
            System.out.println("Do you want to play again?" + " Yes or No");
            stdin.nextLine();
            s = stdin.nextLine();
            if ((s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")) == false) {
                break;
            }

        } 
        
        while (s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y"));

        System.out.println("GAME OVER!");
    } 
}