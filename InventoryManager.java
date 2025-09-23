import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("Apples", 50);
        inventory.put("Oranges", 30);
    }

    /**
     * TO-DO: Add 'quantityToAdd' to the stock of 'itemName'.
     * If 'itemName' doesn't exist, add it to the map with that quantity.
     \*
     * @param itemName The name of the item to restock.
     * @param quantityToAdd The number of items to add.
     */
    public void restockItem(String itemName, int quantityToAdd) {
        // Hint: Use getOrDefault() to simplify your code.
        // Your code here
        int currentQuantity= inventory.getOrDefault(itemName,0);
        inventory.put(itemName,currentQuantity+quantityToAdd);



    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}