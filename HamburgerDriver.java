import java.util.Scanner;

public class HamburgerDriver {

                public static void main(String[] args) {

                               
                                Hamburger hamburgers[] = new Hamburger[2];

                               

                                Scanner scanner = new Scanner(System.in);

                              
                                for (int i = 0; i < hamburgers.length; i++) {

                                                System.out.println("\nHamburger for customer: " + (i + 1));

                                                hamburgers[i] = new Hamburger();

                                                System.out.print("Do you want to add cheese? (y/n): ");

                                                if (scanner.nextLine().equalsIgnoreCase("y")) {

                                                                hamburgers[i].addCheese();

                                                }

                                                System.out.print("Do you want to super size the meal? (y/n): ");

                                                if (scanner.nextLine().equalsIgnoreCase("y")) {

                                                                hamburgers[i].superSizeIt();

                                                }

                                                System.out.print("Would you like a white or wheat bun? ");

                                                hamburgers[i].setBun(scanner.nextLine());

                                                hamburgers[i].addToppings();

                                                hamburgers[i].burgerDetails();

                                }

                }

}