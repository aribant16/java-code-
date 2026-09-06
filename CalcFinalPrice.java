import java.util.Scanner;

public class CalcFinalPrice {

    // Product prices
    private static final double PAPER_PRICE = 5.00;
    private static final double INK_PRICE = 20.00;
    private static final double PRINTER_PRICE = 100.00;
    private static final double PENS_PRICE = 3.99;

    // Discount and tax rates
    private static final double DISCOUNT_RATE = 0.25;
    private static final double TAX_RATE = 0.084;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Calculate the price of the selected products
        double orderPrice = getOrderPrice(scan);

        System.out.printf("%nOrder subtotal: $%.2f%n", orderPrice);

        // Determine whether the customer receives a discount
        System.out.print("Do you get the 25% discount? true or false: ");
        boolean discountApplied = scan.nextBoolean();

        // Calculate and display the final price
        double finalPrice = calculateFinalPrice(orderPrice, discountApplied);

        System.out.printf("Your final total price is: $%.2f%n", finalPrice);

        scan.close();
    }

    /**
     * Gets the customer's product selections and calculates the order price.
     */
    public static double getOrderPrice(Scanner scan) {

        double total = 0.0;

        System.out.print("Do you want Printer Paper? true or false: ");
        if (scan.nextBoolean()) {
            total += PAPER_PRICE;
        }

        System.out.print("Do you want Printer Ink? true or false: ");
        if (scan.nextBoolean()) {
            total += INK_PRICE;
        }

        System.out.print("Do you want a Printer? true or false: ");
        if (scan.nextBoolean()) {
            total += PRINTER_PRICE;
        }

        System.out.print("Do you want Ink Pens? true or false: ");
        if (scan.nextBoolean()) {
            total += PENS_PRICE;
        }

        return total;
    }

    /**
     * Calculates the final order price after applying a discount and tax.
     */
    public static double calculateFinalPrice(
            double price, boolean discountApplied) {

        double subtotal = price;

        if (discountApplied) {
            subtotal *= (1 - DISCOUNT_RATE);
        }

        return subtotal * (1 + TAX_RATE);
    }
}

