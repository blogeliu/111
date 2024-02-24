import java.util.Scanner;
import java.util.ArrayList;

public class SimpleExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Enter up to 20 double values. Enter a non-double value to stop.");

        while (numbers.size() < 20) {
            System.out.print("Enter double value #" + (numbers.size() + 1) + ": ");
            if (scanner.hasNextDouble()) {
                numbers.add(scanner.nextDouble());
            } else {
                break;
            }
        }

        System.out.println("You entered the following values:");
        for (Double number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
