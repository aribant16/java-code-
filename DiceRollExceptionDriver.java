import java.util.Random;

public class DiceRollExceptionDriver {

    public static void main(String[] args) {

        Random rand = new Random();

        // Roll two six-sided dice
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int total = die1 + die2;
        System.out.println("You must roll a 7 to win. Anything higher or lower you lose! ");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + total);

        try {
            // The player wins only when the total is 7
            if (total < 7) {
                throw new DiceRollException("Number is too low");
            } 
            else if (total > 7) {
                throw new DiceRollException("Number is too high");
            }

            System.out.println("You rolled 7! You win!");

        } catch (DiceRollException e) {
            System.out.println(e.getMessage() + ", you lose.");
        }
    }
}

