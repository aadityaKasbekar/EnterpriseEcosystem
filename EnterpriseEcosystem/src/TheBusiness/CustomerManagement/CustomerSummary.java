/*
 * This class represents a summary of a customer, including a reference to a CustomerProfile and order total.
 * It can be used to aggregate and present summarized information about a customer's orders.
 */
package TheBusiness.CustomerManagement;

//import TheBusiness.OrderManagement.Order;

/**
 * Represents a summary of a customer, including a reference to a CustomerProfile and order total.
 * 
 * @author Aaditya Kasbekar
 */
public class CustomerSummary {

    // Reference to the associated CustomerProfile
    CustomerProfile customer;

    // Total value of orders for the customer
    int ordertotal;

    // Constructor to initialize a CustomerSummary with a CustomerProfile
    public CustomerSummary(CustomerProfile cp) {
        customer = cp;
        // TODO: Add logic to calculate and set ordertotal based on the customer's orders.
    }
}
