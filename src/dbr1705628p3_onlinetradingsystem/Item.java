/*
 * Name: Raghad Zohair. ID: 1705628
 * Section Number: DBR
 * Program3_OnlineTradingSystem.
 */
package dbr1705628p3_onlinetradingsystem;

/**
 *
 * @author Raghad
 */
public class Item {
    
    private int itemId;
    private String itemName;   
    private double price;
    private Seller owner;
    private int inStock;

    public Item(int itemId, String itemName, double price, Seller owner, int inStock) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.owner = owner;
        this.inStock = inStock;
    }
    

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }


    public Seller getOwner() {
        return owner;
    }

    public void setOwner(Seller owner) {
        this.owner = owner;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "Item{" + "itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", owner=" + owner + ", inStock=" + inStock + '}';
    }
    
    

}
