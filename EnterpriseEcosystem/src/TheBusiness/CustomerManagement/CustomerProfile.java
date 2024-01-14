/**
 * Represents a customer profile, extending the base Profile class.
 * Contains information about customer orders, markets, and provides methods to analyze order performance.
 */
package TheBusiness.CustomerManagement;

import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import java.util.ArrayList;

/**
 * Represents a customer profile, extending the base Profile class.
 * Contains information about customer orders, markets, and provides methods to analyze order performance.
 * 
 * @author Aaditya Kasbekar
 */
public class CustomerProfile extends Profile {

    // ArrayList to store customer orders
    ArrayList<Order> orders;

    // Reference to the associated person
    Person person;

    /**
     * Constructor to initialize a customer profile with a person and an empty list of orders.
     * 
     * @param p The associated Person object.
     */
    public CustomerProfile(Person p) {
        super(p);
        person = p;
        orders = new ArrayList();
    }

    /**
     * Overrides the getRole method to specify the role as "Sales".
     * 
     * @return The role of the customer profile.
     */
    @Override
    public String getRole() {
        return "Sales";
    }

    /**
     * Checks if the customer profile matches a given ID.
     * 
     * @param id The ID to be checked for a match.
     * @return True if the customer profile's associated person ID matches the provided ID, false otherwise.
     */
    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    /**
     * Adds a customer order to the profile.
     * 
     * @param o The Order object to be added.
     */
    public void addCustomerOrder(Order o) {
        orders.add(o);
    }

    /**
     * Overrides the toString method to provide a string representation of the customer profile.
     * 
     * @return The customer's ID.
     */
    @Override
    public String toString() {
        return person.getPersonId();
    }

    /**
     * Gets the customer's ID.
     * 
     * @return The customer's ID.
     */
    public String getCustomerId() {
        return person.getPersonId();
    }

    /**
     * Gets the associated person.
     * 
     * @return The associated Person object.
     */
    public Person getPerson() {
        return person;
    }
}
