import java.util.ArrayList;
import java.util.Scanner;

public class BigYStorePizzaOrder {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] availableToppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon", "Extra Cheese"};

    public static void main(String[] args) {
        System.out.println("Welcome to BigY Store Pizza Ordering System!");
        System.out.println("🎉 Special Offer: Free drink with every Super-sized pizza ordered today!");

        // Select pizza size and remember the option chosen for later use
        int sizeOption = selectPizzaSize();
        double price = switch (sizeOption) {
            case 1 -> 5;
            case 2 -> 10;
            case 3 -> 15;
            case 4 -> 20;
            default -> 0; // Consider handling this case more gracefully
        };

        ArrayList<String> toppings = selectToppings();
        double toppingCharge = calculateToppingCharge(toppings);
        price += toppingCharge;

        System.out.println("\nYour pizza order summary:");
        System.out.println("Size: " + getSizeName(sizeOption) + " - $" + price);
        System.out.println("Toppings: " + toppings);
        System.out.println("Total cost: $" + price);

        System.out.println("\nWould you like to confirm your order? (yes/no)");
        String confirmation = scanner.nextLine().trim();
        if (confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Thank you! Your order has been placed. 🍕");
            System.out.println("You earned 10 loyalty points with this order!");
        } else {
            System.out.println("Order cancelled. Feel free to start over.");
        }

        scanner.close();
    }

    private static int selectPizzaSize() {
        System.out.println("Please select a pizza size:");
        System.out.println("1. Small ($5)\n2. Medium ($10)\n3. Large ($15)\n4. Super ($20)");
        int sizeOption = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return sizeOption;
    }

    private static ArrayList<String> selectToppings() {
        ArrayList<String> toppings = new ArrayList<>();
        System.out.println("Select your toppings by number (Max 3). Type 'done' to finish:");
        for (int i = 0; i < availableToppings.length; i++) {
            System.out.println((i + 1) + ". " + availableToppings[i]);
        }

        while (toppings.size() < 3) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) break;
            try {
                int index = Integer.parseInt(input) - 1;
                if (index >= 0 && index < availableToppings.length) {
                    String selectedTopping = availableToppings[index];
                    if (!toppings.contains(selectedTopping)) {
                        toppings.add(selectedTopping);
                        System.out.println(selectedTopping + " added.");
                    } else {
                        System.out.println("Topping already added. Choose a different one.");
                    }
                } else {
                    System.out.println("Invalid selection. Please select a valid topping number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number or 'done' to finish.");
            }
        }
        return toppings;
    }

    private static double calculateToppingCharge(ArrayList<String> toppings) {
        return switch (toppings.size()) {
            case 2 -> 1;
            case 3 -> 1.25;
            default -> 0.5 * toppings.size();
        };
    }

    private static String getSizeName(int sizeOption) {
        return switch (sizeOption) {
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            case 4 -> "Super";
            default -> "Unknown Size";
        };
    }
}
