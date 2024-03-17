public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    // Constructor
    public DeliveryPizza(String[] toppings, String deliveryAddress, int numberOfToppings) {
        super(toppings, numberOfToppings);
        this.deliveryAddress = deliveryAddress;
        // Setting the delivery fee
        this.deliveryFee = super.getPrice() > 18 ? 3 : 5;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDelivery Address: " + deliveryAddress + "\nDelivery Fee: $" + String.format("%.2f", deliveryFee) + "\nTotal Price: $" + String.format("%.2f", super.getPrice() + deliveryFee);
    }
}
