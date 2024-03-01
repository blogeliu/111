import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("* Welcome to the Wedding Planner! *");
        System.out.println("************************************\n");

        // Bride's details
        System.out.println("Let's start with the bride's details.");
        System.out.print("First Name: ");
        String brideFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String brideLastName = scanner.nextLine();
        System.out.printf("You've entered: %s %s\n\n", brideFirstName, brideLastName);

        // Groom's details
        System.out.println("Now, let's move on to the groom's details.");
        System.out.print("First Name: ");
        String groomFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String groomLastName = scanner.nextLine();
        System.out.printf("You've entered: %s %s\n\n", groomFirstName, groomLastName);

        LocalDate weddingDate = null;
        while (weddingDate == null) {
            System.out.println("Please enter the wedding date (YYYY-MM-DD):");
            String dateString = scanner.nextLine();
            try {
                weddingDate = LocalDate.parse(dateString);
            } catch (DateTimeParseException e) {
                System.out.println("That's not a valid date format. Please try again.\n");
            }
        }

        System.out.println("Finally, where is this wonderful event taking place?");
        System.out.print("Location: ");
        String location = scanner.nextLine();

        Person bride = new Person(brideFirstName, brideLastName);
        Person groom = new Person(groomFirstName, groomLastName);
        Couple couple = new Couple(bride, groom);
        Wedding wedding = new Wedding(couple, weddingDate, location);

        System.out.println("\n************************************");
        System.out.println("Wedding Details:");
        System.out.println("************************************");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName() + " " + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " " + wedding.getCouple().getGroom().getLastName());
        System.out.println("Date: " + wedding.getWeddingDate());
        System.out.println("Location: " + wedding.getLocation());
        System.out.println("************************************");
    }
}
