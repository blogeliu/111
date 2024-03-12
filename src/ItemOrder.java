public class ItemOrder {
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        // Example bulk discount logic (modify as needed)
        if ("tissues".equals(item.getName()) && quantity >= 2) {
            int bulkQuantity = quantity / 2;
            int singleItems = quantity % 2;
            return (bulkQuantity * 4) + (singleItems * item.getPrice()); // Bulk price + single item price
        }
        return quantity * item.getPrice();
    }
}
