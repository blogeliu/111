import java.util.Scanner;

public class UseParty {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(ANSI_GREEN + "Welcome to the Ultimate Party Planner!" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "---------------------------------------" + ANSI_RESET);

        System.out.println(ANSI_YELLOW + "\nLet's plan a basic party first!" + ANSI_RESET);
        Party party = new Party();
        System.out.print("How many guests are you expecting? >> ");
        int numGuests = scanner.nextInt();
        party.setGuests(numGuests);
        System.out.println(ANSI_BLUE + "\nGreat! Your party is set up for " + party.getGuests() + " guests." + ANSI_RESET);
        party.displayInvitation();

        System.out.println(ANSI_PURPLE + "\n---------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Now, let's upgrade to a Dinner Party!" + ANSI_RESET);
        DinnerParty dinnerParty = new DinnerParty();
        System.out.print("How many guests are you expecting for the dinner party? >> ");
        numGuests = scanner.nextInt();
        dinnerParty.setGuests(numGuests);

        // Menu selection
        System.out.println(ANSI_PURPLE + "\nTime to choose the dinner menu!" + ANSI_RESET);
        System.out.println("1 - " + ANSI_BLUE + "Chicken Fiesta: A delightful chicken feast for the meat lovers." + ANSI_RESET);
        System.out.println("2 - " + ANSI_GREEN + "Vegetarian Delight: A selection of gourmet vegetarian dishes." + ANSI_RESET);
        System.out.print("Enter your menu choice (1 or 2) >> ");
        int dinnerChoice = scanner.nextInt();


        String menuChoiceDescription = dinnerChoice == 1 ? "Chicken Fiesta" : "Vegetarian Delight";
        dinnerParty.setDinnerChoice(dinnerChoice);
        System.out.println(ANSI_GREEN + "\nExcellent choice! The " + menuChoiceDescription + " will be served." + ANSI_RESET);

        System.out.println(ANSI_YELLOW + "\nThe dinner party will entertain " + dinnerParty.getGuests() + " guests with the " + menuChoiceDescription + "." + ANSI_RESET);
        dinnerParty.displayInvitation();

        // Surprise element
        System.out.println(ANSI_RED + "\nAs a special bonus, we're including a live music band for the evening! Enjoy your party!" + ANSI_RESET);
    }
}

