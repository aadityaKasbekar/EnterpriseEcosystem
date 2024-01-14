/*
 * This class represents a directory of EmployeeProfile objects.
 * It provides methods to manage a list of employee profiles, including adding new profiles and finding profiles by ID.
 */
package TheBusiness.Personnel;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 * Represents a directory of EmployeeProfile objects.
 * 
 * @author Aaditya Kasbekar
 */
public class EmployeeDirectory {

    // Reference to the associated business
    Business business;

    // ArrayList to store a list of EmployeeProfile objects
    ArrayList<EmployeeProfile> employeelist;

    // Constructor to initialize the EmployeeDirectory with a business and an empty list of employee profiles
    public EmployeeDirectory(Business d) {
        business = d;
        employeelist = new ArrayList();
    }

    // Method to create a new EmployeeProfile with the given person and add it to the directory
    public EmployeeProfile newEmployeeProfile(Person p) {
        // Create a new EmployeeProfile object
        EmployeeProfile sp = new EmployeeProfile(p);
        // Add the new EmployeeProfile to the list
        employeelist.add(sp);
        // Return the newly created EmployeeProfile
        return sp;
    }

    // Method to find an EmployeeProfile in the directory based on the provided ID
    public EmployeeProfile findEmployee(String id) {
        // Iterate through the list of employee profiles
        for (EmployeeProfile sp : employeelist) {
            // Check if the provided ID matches the ID of the current employee profile
            if (sp.isMatch(id)) {
                // Return the matching employee profile if found
                return sp;
            }
        }
        // Return null if no employee profile with the provided ID is found in the directory
        return null; // not found after going through the whole list
    }
}
