/**
 * Represents an item in an order with a selected product and quantity.
 * Calculates and tracks order item total, target total, and price performance.
 */
package TheBusiness.OrderManagement;
import TheBusiness.ProductManagement.Product;

/**
 * Represents an item in an order with a selected product and quantity.
 * Calculates and tracks order item total, target total, and price performance.
 * 
 * @author Aaditya Kasbekar
 */
public class OrderItem {
    Product product;
    int quantity;

    /**
     * Constructor to create an order item with a selected product and quantity.
     * 
     * @param p The selected Product object.
     * @param q The quantity of the product in the order.
     */
    public OrderItem(Product p, int q) {
        product = p;
        quantity = q;
    }

    /**
     * Gets the selected product of the order item.
     * 
     * @return The selected Product object.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the selected product of the order item.
     * 
     * @param product The Product object to be set as the selected product.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Sets the quantity of the product in the order item.
     * 
     * @param quantity The quantity to be set for the order item.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the quantity of the product in the order item.
     * 
     * @return The quantity of the product in the order item.
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Calculates and returns the total cost of the order item.
     * 
     * @return The total cost of the order item.
     */
    public float getOrderItemTotal() {
        return product.getPrice() * quantity;
    }
}
