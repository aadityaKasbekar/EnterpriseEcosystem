/*
 * This class represents a directory of CustomerProfile objects.
 * It provides methods to manage a list of customer profiles, including adding new profiles, finding profiles by ID, 
 * and generating a customer performance report.
 */
package TheBusiness.CustomerManagement;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Person;
import java.util.ArrayList;

/**
 * Represents a directory of CustomerProfile objects.
 * 
 * @author Aaditya Kasbekar
 */
public class CustomerDirectory {

    // Reference to the associated business
    Business business;

    // ArrayList to store a list of CustomerProfile objects
    ArrayList<CustomerProfile> customerlist;

    // Constructor to initialize the CustomerDirectory with a business and an empty list of customer profiles
    public CustomerDirectory(Business b) {
        business = b;
        customerlist = new ArrayList();
    }

    // Method to create a new CustomerProfile with the given person and add it to the directory
    public CustomerProfile newCustomerProfile(Person p) {
        // Create a new CustomerProfile object
        CustomerProfile sp = new CustomerProfile(p);
        // Add the new CustomerProfile to the list
        customerlist.add(sp);
        // Return the newly created CustomerProfile
        return sp;
    }

    // Method to find a CustomerProfile in the directory based on the provided ID
    public CustomerProfile findCustomer(String id) {
        // Iterate through the list of customer profiles
        for (CustomerProfile sp : customerlist) {
            // Check if the provided ID matches the ID of the current customer profile
            if (sp.isMatch(id)) {
                // Return the matching customer profile if found
                return sp;
            }
        }
        // Return null if no customer profile with the provided ID is found in the directory
        return null; // not found after going through the whole list
    }

}
