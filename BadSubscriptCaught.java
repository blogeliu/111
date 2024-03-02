import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        // Declare an array of 10 first names
        String[] firstNames = {"John", "Jane", "Mary", "Michael", "Sarah", "Robert", "Emily", "William", "Jessica", "Daniel"};

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer to display a name from the list (0-9):");

        try {
            // Prompt the user for an integer
            int index = scanner.nextInt();

            // Display the name in the requested position
            System.out.println("The name at position " + index + " is: " + firstNames[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Display error message if the number is out of range
            System.out.println("Error: The number you entered is out of range. Please enter a number between 0 and 9.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
