class Drink {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
class Order  {
    private Drink[] drinks;
    private int[] quantities;
    public Order(Drink[] drinks, int[] quantities) {
        this.drinks = drinks;
        this.quantities = quantities;
    }
    public double calculateTotalAmount() {
        double totalAmount = 0.0;
        
        for (int i = 0; i < drinks.length; i++) {
            totalAmount += drinks[i].getPrice() * quantities[i];
        }
        return totalAmount;
    }
}
public class Drinks {
    public static void main(String[] args) {
        Drink[] drinks = {
            new Drink("Coke", 2.5),
            new Drink("Sprite", 2.0),
            new Drink("Fanta", 2.0) };

        int[] quantities = {2, 1, 3};
        Order order = new Order(drinks, quantities);
        double totalAmount = order.calculateTotalAmount();
        System.out.println("Drinks Menu:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].getName() + ": Rs " + drinks[i].getPrice());
        }
        System.out.println("\nOrder Summary:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i].getName() + ": " + quantities[i]);
        }
        System.out.println("\nTotal Amount: Rs " + totalAmount);
    }
}
