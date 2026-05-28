/**
 * DESCRIPTION:
 * This app is meant to manage a retail store inventory. 
 * It tracks an item's current stock level and its price.
 * It should allow a simulation of selling items (reducing stock) 
 * and restock items (increasing stock). 
 * It should prevent stock from going below 0, and ensure prices are positive.
 */
public class InventoryManager {
    private String itemName;
    private int stock;
    private double price;

    public InventoryManager(String name, int initialStock, double initialPrice) {
        this.itemName = name;
        this.stock = initialStock;
        this.price = initialPrice;
    }

    public void sellItem(int quantity) {
        if (stock - quantity < 0) {
            System.out.println("Not enough stock to sell " + quantity + " units.");
        } else {
            
            System.out.println(quantity + " units sold successfully.");
            stock -= quantity;
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        } else {
            System.out.println("To restock please select a correct amount");
        }
    }

    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.err.println("The new price must be a positive value");
        }
    }

    public void displayStatus() {
        System.out.println("Item: " + itemName + " | Stock: " + stock + " | Price: $" + price);
    }

    public static void main(String[] args) {
        InventoryManager item = new InventoryManager("Wireless Mouse", 10, 25.99);
        
        item.sellItem(3);
        item.restock(-5); 
        item.updatePrice(-10.00); 
        
        item.displayStatus();
    }
}