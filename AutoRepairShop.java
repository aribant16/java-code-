
import java.util.Scanner;

/**
 * Calculates maintenance costs for an automobile repair visit.
 */
public class AutoRepairShop {

    private static final double LABOR_RATE = 0.30;
    private static final double IMPORT_FEE = 0.05;
    private static final double SALES_TAX = 0.07;

    private static final String[] SERVICES = {
        "Oil Change",
        "Tire Rotation",
        "Air Filter",
        "Check Fluids"
    };

    private static final double[] PRICES = {
        39.99,
        49.99,
        19.99,
        10.99
    };

    /**
     * Displays a greeting using the customer's automobile make.
     *
     * @param make automobile make
     */
    public static void displayGreeting(String make) {
        System.out.println("\nWelcome to the Auto Repair Shop!");
        System.out.println("We will be happy to service your "
                + make + " automobile today.");
    }

    /**
     * Displays available maintenance services and calculates
     * the subtotal based on the customer's selections.
     *
     * @param make automobile make
     * @param scanner scanner used for user input
     * @return service subtotal
     */
    public static double calculateServiceTotal(String make, Scanner scanner) {
        double subtotal = 0.0;

        System.out.println("\nAvailable Maintenance Services");

        for (int i = 0; i < SERVICES.length; i++) {
            System.out.printf(
                    "%n%d. %-20s $%.2f%n",
                    i + 1,
                    SERVICES[i],
                    PRICES[i]
            );

            System.out.print("Select this service? (1 = Yes, 0 = No): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                subtotal += PRICES[i];
                System.out.println(SERVICES[i] + " added to your " + make + " service.");
            }
        }

        return subtotal;
    }

    /**
     * Calculates the final repair bill by adding labor,
     * an optional imported vehicle fee, and sales tax.
     *
     * @param subtotal service subtotal
     * @param imported whether the vehicle is imported
     * @return final bill
     */
    public static double calculateFinalPrice(double subtotal, boolean imported) {
        double laborCost = subtotal * LABOR_RATE;
        double total = subtotal + laborCost;

        if (imported) {
            total += total * IMPORT_FEE;
        }

        total += total * SALES_TAX;

        return total;
    }

    /**
     * Displays a summary of the customer's repair bill.
     *
     * @param subtotal service subtotal
     * @param finalPrice final bill amount
     */
    public static void displayBill(double subtotal, double finalPrice) {
        System.out.println("\n-----------------------------");
        System.out.println("       REPAIR BILL");
        System.out.println("-----------------------------");
        System.out.printf("Service Subtotal: $%.2f%n", subtotal);
        System.out.printf("Final Total:      $%.2f%n", finalPrice);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What make of automobile do you own? ");
        String make = scanner.nextLine();

        displayGreeting(make);

        double subtotal = calculateServiceTotal(make, scanner);

        System.out.print("\nIs your car imported? (1 = Yes, 0 = No): ");
        boolean imported = scanner.nextInt() == 1;

        double finalPrice = calculateFinalPrice(subtotal, imported);

        displayBill(subtotal, finalPrice);

        scanner.close();
    }
}
