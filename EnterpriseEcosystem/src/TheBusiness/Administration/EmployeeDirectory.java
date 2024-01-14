package TheBusiness.Administration;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Person;
import java.util.ArrayList;

/**
 * Represents a directory of employee profiles.
 * Provides methods to manage a list of employees, including adding new employee profiles and finding employee profiles by ID.
 * 
 * @author Aadity Kasbekar
 */
public class EmployeeDirectory {

    // Reference to the associated business
    private Business business;

    // ArrayList to store a list of employee profiles
    private ArrayList<EmployeeProfile> employeeList;

    /**
     * Constructor to initialize the EmployeeDirectory with a business and an empty list of employees.
     * 
     * @param business The associated business.
     */
    public EmployeeDirectory(Business business) {
        this.business = business;
        this.employeeList = new ArrayList<>();
    }

    /**
     * Create a new employee profile and add it to the directory.
     * 
     * @param person The associated person for the employee profile.
     * @return The newly created employee profile.
     */
    public EmployeeProfile newEmployeeProfile(Person person) {
        EmployeeProfile employeeProfile = new EmployeeProfile(person);
        employeeList.add(employeeProfile);
        return employeeProfile;
    }

    /**
     * Find an employee profile in the directory based on the provided ID.
     * 
     * @param id The ID to search for.
     * @return The matching employee profile if found, or null if not found.
     */
    public EmployeeProfile findEmployee(String id) {
        for (EmployeeProfile employeeProfile : employeeList) {
            if (employeeProfile.isMatch(id)) {
                return employeeProfile;
            }
        }
        return null;  // not found after going through the whole list
    }
}
