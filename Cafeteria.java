import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] weekdays = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
        };

        String[] menuItems = new String[5];
        double[] prices = new double[5];

        System.out.println("=== Weekly Cafeteria Menu ===");

        // Collect the menu items
        for (int i = 0; i < weekdays.length; i++) {
            System.out.print("Enter the entree for " + weekdays[i] + ": ");
            menuItems[i] = scanner.nextLine();
        }

        System.out.println("\n=== Enter Menu Prices ===");

        // Collect the prices
        for (int i = 0; i < menuItems.length; i++) {
            System.out.print("Enter the price of " + menuItems[i] + ": $");
            prices[i] = scanner.nextDouble();
        }

        scanner.nextLine(); // Clear the input buffer

        // Find the most expensive entree
        int highestPriceIndex = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[highestPriceIndex]) {
                highestPriceIndex = i;
            }
        }

        // Search for an entree
        System.out.print("\nEnter an entree to search for: ");
        String searchItem = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i].equalsIgnoreCase(searchItem)) {
                System.out.println(searchItem + " is served on " + weekdays[i] + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchItem + " is not on this week's menu.");
        }

        // Display the most expensive entree
        System.out.println("\n=== Menu Summary ===");
        System.out.printf(
            "The highest-priced entree is %s at $%.2f.%n",
            menuItems[highestPriceIndex],
            prices[highestPriceIndex]
        );

        scanner.close();
    }
}
