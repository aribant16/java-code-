import java.util.Scanner;

public class Hamburger {

               

                private String bun;

                private int patties;

                private boolean cheese;

                private double price;

                private String[] toppings;

                private int toppingsCount;

                private static String[] toppingsAvailable = { "tomatoes", "red onions",
 
                                                "spinach", "jalapenos", "mustard" };
                public Hamburger() {

                               
                                bun = "white";

                                patties = 1;

                                cheese = false;

                                toppings = new String[5];

                                toppingsCount = 0;

                                price = 1.99;

                }

               

                public String getBun() {

                                return bun;

                }

                public void setBun(String bun) {

                                this.bun = bun;

                }

                public int getPatties() {

                                return patties;

                }

                public void setPatties(int patties) {

                                this.patties = patties;

                }

                public boolean hasCheese() {

                                return cheese;

                }

                public void setCheese(boolean cheese) {

                                this.cheese = cheese;

                }

                public double getPrice() {

                                return price;

                }

                public void setPrice(double price) {

                                this.price = price;

                }

                
                public void addCheese() {

                                cheese = true;

                                price += 0.50;

                }

               

                public void superSizeIt() {

                                patties += 1;

                                price += 1.00;

                }

             
                public void addToppings() {

                                Scanner scanner = new Scanner(System.in);

                                for (String s : toppingsAvailable) {

                                                System.out.print("Do you want to add " + s + " topping? (y/n): ");

                                                if (scanner.nextLine().equalsIgnoreCase("y")) {

                                                                toppings[toppingsCount] = s;

                                                                toppingsCount++;

                                                }

                                }

                }

            

                public void burgerDetails() {

                                System.out.println("...BURGER DETAILS...");

                                System.out.println("Bun type: " + bun);

                                System.out.println("Number of patties: " + patties);

                                System.out.println("Has cheese? : " + cheese);

                                System.out.print("Toppings: ");

                                for (int i = 0; i < toppingsCount; i++) {

                                                System.out.print(toppings[i]);

                                                if (i != toppingsCount - 1) {

                                                                System.out.print(", ");

                                                }

                                }

                                System.out.printf("\nPrice: $%.2f\n", price);

                }

}