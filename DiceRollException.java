/**
 * Custom exception used when the dice roll does not equal 7.
 */
public class DiceRollException extends Exception {

    public DiceRollException(String message) {
        super(message);
    }
}
