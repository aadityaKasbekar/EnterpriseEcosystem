/**
 * Represents an order with a list of order items, associated customer, salesperson, and status.
 * Calculates and tracks order total, price performance, and item counts.
 * Manages order submission and cancellation.
 */
package TheBusiness.OrderManagement;

import java.util.ArrayList;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.Personnel.Enterprise1.Organization2.SalesPersonProfile;
import TheBusiness.Personnel.Profile;
import TheBusiness.ProductManagement.Product;


/**
 * Represents an order with a list of order items, associated customer, salesperson, and status.
 * Calculates and tracks order total, price performance, and item counts.
 * Manages order submission and cancellation.
 * 
 * @author Aaditya Kasbekar
 */
public class Order {

    ArrayList<OrderItem> orderitems;
    Profile customer;
    SalesPersonProfile salesperson;
    String status;
    String id;

    /**
     * Default constructor for an order.
     */
    public Order(String id) {
        this.id = id;
    }
    
    public String getOrderId() {
        return this.id;
    }

    /**
     * Constructor to create an order with an associated customer and default status "in process".
     * 
     * @param cp The associated CustomerProfile object.
     */
    public Order(String id, Profile cp) {
        orderitems = new ArrayList();
        this.customer = cp;
        salesperson = null;
        status = "";
        this.id = id;
    }

    /**
     * Constructor to create an order with an associated customer, salesperson, and default status "in process".
     * 
     * @param cp The associated CustomerProfile object.
     * @param ep The associated SalesPersonProfile object.
     */
    public Order(CustomerProfile cp, SalesPersonProfile ep) {
        orderitems = new ArrayList();
        customer = cp;
        salesperson = ep;
    }

    /**
     * Creates a new order item and adds it to the order.
     * 
     * @param p The selected Product object.
     * @param q The quantity of the product in the order item.
     * @return The created OrderItem object.
     */
    public OrderItem newOrderItem(Product p, int q) {
        OrderItem oi = new OrderItem(p, q);
        orderitems.add(oi);
        return oi;
    }
    
    public ArrayList<OrderItem> getOrderItems() {
        return this.orderitems;
    }

    /**
     * Gets the total price of the order, which is the sum of order item totals.
     * 
     * @return The total price of the order.
     */
    public float getOrderTotal() {
        float sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }
    
    public void setCustomer(Profile p) {
        this.customer = p;
    }
    
    public void setSalesPerson(SalesPersonProfile p) {
        this.salesperson = p;
    }
    
    

    /**
     * Cancels the order by setting the status to "Cancelled".
     */
    public void cancelOrder() {
        status = "Cancelled";
    }

    /**
     * Submits the order by setting the status to "Submitted".
     */
    public void submitOrder() {
        status = "Submitted";
    }
    
    public void approveOrder() {
        status = "Approved";
    }

    public Profile getCustomer() {
        return this.customer;
    }

    public SalesPersonProfile getSalesperson() {
        return salesperson;
    }
    
    public String getOrderStatus() {
        return this.status;
    }
}
