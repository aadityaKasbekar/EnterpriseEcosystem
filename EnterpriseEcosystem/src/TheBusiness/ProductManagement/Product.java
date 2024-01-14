/**
 * Represents a product with a name, price, and order items.
 * Tracks sales and price performance of the product based on order items.
 */
package TheBusiness.ProductManagement;

import java.util.ArrayList;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.Enterprise1.Organization2.SalesPersonProfile;
/**
 * Represents a product with a name, price, and order items.
 * Tracks sales and price performance of the product based on order items.
 * 
 * @author Aaditya Kasbekar
 */
public class Product {
    private String id;
    private String name;
    private float price;
    private int quantity;
    
     SalesPersonProfile salesPersonProfile;

    /**
     * Constructor to create a product with a name.
     * 
     * @param n The name of the product.
     * @param p The price of the product.
     */
    public Product(String n, float p, int q) {
        name = n;
        price = p;
        quantity = q;
      
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SalesPersonProfile getSalesPersonProfile() {
        return salesPersonProfile;
    }

    /**
     * Adds an order item to the product's order items list.
     * 
     * @param oi The OrderItem object to be added.
     */
    public void setSalesPersonProfile(SalesPersonProfile salesPersonProfile) {   
        this.salesPersonProfile = salesPersonProfile;
    }

    /**
     * Sets the name of the product.
     * 
     * @param n The name to be set for the product.
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Gets the name of the product.
     * 
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the product.
     * 
     * @return The price of the product.
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     * 
     * @param price The price to be set for the product.
     */
    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return name;
    }
}
