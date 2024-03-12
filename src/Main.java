public class Main {
    public static void main(String[] args) {

        Item tissues = new Item("tissues", 3);
        Item bread = new Item("bread", 2.5);


        ItemOrder order1 = new ItemOrder(tissues, 5); // 5 boxes of tissues
        ItemOrder order2 = new ItemOrder(bread, 2); // 2 loaves of bread


        ShoppingCart cart = new ShoppingCart();
        cart.addItemOrder(order1);
        cart.addItemOrder(order2);


        System.out.println("Total shopping cart price: $" + cart.getTotalPrice());
    }
}
