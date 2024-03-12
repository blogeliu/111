import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ItemOrder> list;

    public ShoppingCart() {
        list = new ArrayList<>();
    }

    public void addItemOrder(ItemOrder order) {
        list.add(order);
    }

    public boolean removeItemOrder(String itemName) {
        for (ItemOrder order : list) {
            if (order.getItem().getName().equals(itemName)) {
                list.remove(order);
                return true;
            }
        }
        return false;
    }

    public ItemOrder searchItemOrder(String itemName) {
        for (ItemOrder order : list) {
            if (order.getItem().getName().equals(itemName)) {
                return order;
            }
        }
        return null;
    }

    public double getTotalPrice() {
        double total = 0;
        for (ItemOrder order : list) {
            total += order.getPrice();
        }
        return total;
    }
}
