import java.util.Scanner;

public class DemoPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toppings = new String[10];
        int count = 0;
        System.out.println("Enter toppings (type 'QUIT' to finish):");

        while (count < 10) {
            String input = scanner.nextLine();
            if ("QUIT".equalsIgnoreCase(input)) {
                break;
            }
            toppings[count++] = input;
            if (count < 10) {
                System.out.println("Add another topping or type 'QUIT':");
            }
        }

        System.out.println("Is this pizza to be delivered? (yes/no)");
        String delivery = scanner.nextLine();

        if ("yes".equalsIgnoreCase(delivery)) {
            System.out.println("Enter delivery address:");
            String address = scanner.nextLine();
            DeliveryPizza pizza = new DeliveryPizza(toppings, address, count);
            System.out.println(pizza);
        } else {
            Pizza pizza = new Pizza(toppings, count);
            System.out.println(pizza);
        }

        scanner.close();
    }
}
