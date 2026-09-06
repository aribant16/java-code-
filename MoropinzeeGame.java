
import java.util.Scanner;

public class MoropinzeeGame {

    // Characters available in the game
    enum Character {
        GORILLA,
        TERMINATOR,
        GANGSTER,
        WARRIOR,
        ZOMBIE
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Hey, let's play Moropinzee!\n");
        System.out.println("Please enter a move.");

        while (playAgain) {

            // Get each player's choice
            Character player1 = getPlayerChoice(stdin, 1);
            Character player2 = getPlayerChoice(stdin, 2);

            // Determine and display the winner
            determineWinner(player1, player2);

            // Ask if players want another round
            playAgain = askToPlayAgain(stdin);
        }

        System.out.println("GAME OVER!");
        stdin.close();
    }

    /**
     * Gets and validates a player's character choice.
     */
    private static Character getPlayerChoice(Scanner stdin, int playerNumber) {

        System.out.println(
            "Player " + playerNumber +
            ": Enter a move from 1-5 for Gorilla, Terminator, " +
            "Gangster, Warrior or Zombie:"
        );

        int choice = stdin.nextInt();

        while (choice < 1 || choice > 5) {
            System.out.println(
                "Invalid choice, Player " + playerNumber +
                ". Enter a number 1-5:"
            );
            choice = stdin.nextInt();
        }

        return getCharacter(choice);
    }

    /**
     * Converts the player's number into a game character.
     */
    private static Character getCharacter(int choice) {

        switch (choice) {
            case 1:
                return Character.GORILLA;
            case 2:
                return Character.TERMINATOR;
            case 3:
                return Character.GANGSTER;
            case 4:
                return Character.WARRIOR;
            case 5:
                return Character.ZOMBIE;
            default:
                throw new IllegalArgumentException("Invalid character choice.");
        }
    }

    /**
     * Determines the winner based on the game's predefined matchups.
     */
    private static void determineWinner(Character player1, Character player2) {

        if (player1 == player2) {
            System.out.println("Nobody wins!");
            return;
        }

        if (playerOneWins(player1, player2)) {
            displayMatchup(player1, player2);
            System.out.println("Player 1 wins!");
        } else {
            displayMatchup(player2, player1);
            System.out.println("Player 2 wins!");
        }
    }

    /**
     * Determines whether Player 1 defeats Player 2.
     */
    private static boolean playerOneWins(Character player1, Character player2) {

        return
            (player1 == Character.GORILLA &&
                (player2 == Character.WARRIOR ||
                 player2 == Character.TERMINATOR))

            || (player1 == Character.TERMINATOR &&
                (player2 == Character.WARRIOR ||
                 player2 == Character.ZOMBIE))

            || (player1 == Character.GANGSTER &&
                (player2 == Character.TERMINATOR ||
                 player2 == Character.GORILLA))

            || (player1 == Character.WARRIOR &&
                (player2 == Character.GANGSTER ||
                 player2 == Character.ZOMBIE))

            || (player1 == Character.ZOMBIE &&
                (player2 == Character.GANGSTER ||
                 player2 == Character.GORILLA));
    }

    /**
     * Displays the result of the character matchup.
     */
    private static void displayMatchup(Character winner, Character loser) {

        if (winner == Character.GORILLA && loser == Character.WARRIOR) {
            System.out.print("Gorilla fools Warrior. ");

        } else if (winner == Character.GORILLA &&
                   loser == Character.TERMINATOR) {
            System.out.print("Gorilla unplugs Terminator. ");

        } else if (winner == Character.TERMINATOR &&
                   loser == Character.WARRIOR) {
            System.out.print("Terminator chokes Warrior. ");

        } else if (winner == Character.TERMINATOR &&
                   loser == Character.ZOMBIE) {
            System.out.print("Terminator crushes Zombie. ");

        } else if (winner == Character.GANGSTER &&
                   loser == Character.TERMINATOR) {
            System.out.print("Gangster drowns Terminator. ");

        } else if (winner == Character.GANGSTER &&
                   loser == Character.GORILLA) {
            System.out.print("Gangster skewers Gorilla. ");

        } else if (winner == Character.WARRIOR &&
                   loser == Character.GANGSTER) {
            System.out.print("Warrior chops Gangster. ");

        } else if (winner == Character.WARRIOR &&
                   loser == Character.ZOMBIE) {
            System.out.print("Warrior decapitates Zombie. ");

        } else if (winner == Character.ZOMBIE &&
                   loser == Character.GANGSTER) {
            System.out.print("Zombie eats Gangster. ");

        } else if (winner == Character.ZOMBIE &&
                   loser == Character.GORILLA) {
            System.out.print("Zombie savages Gorilla. ");
        }
    }

    /**
     * Asks the players whether they want to play another round.
     */
    private static boolean askToPlayAgain(Scanner stdin) {

        System.out.println("Do you want to play again? Yes or No");

        stdin.nextLine(); // Clear leftover newline
        String response = stdin.nextLine();

        return response.equalsIgnoreCase("yes")
            || response.equalsIgnoreCase("y");
    }
}

