public class Pizza {
    private String[] toppings;
    private double price;

    // Constructor
    public Pizza(String[] toppings, int numberOfToppings) {
        this.toppings = new String[10]; // Maximum of 10 toppings
        System.arraycopy(toppings, 0, this.toppings, 0, numberOfToppings);
        // Creating a String description from the list of toppings
        String description = String.join(", ", this.toppings).trim();
        // Setting the price
        this.price = 14 + (2 * numberOfToppings);
    }

    @Override
    public String toString() {
        return "Pizza with toppings: " + String.join(", ", toppings) + "\nPrice: $" + String.format("%.2f", price);
    }

    // Getters for subclasses to use
    public double getPrice() {
        return price;
    }
}
