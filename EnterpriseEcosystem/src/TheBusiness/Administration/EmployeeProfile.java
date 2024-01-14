package TheBusiness.Administration;  // Update the package name as needed

import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;

/**
 * Represents an employee profile, extending the base Profile class.
 * The role for this profile is "Admin."
 * 
 * @author Aaditya Kasbekar
 */
public class EmployeeProfile extends Profile {

    /**
     * Constructor to initialize an employee profile with a person.
     * 
     * @param p The associated person.
     */
    public EmployeeProfile(Person p) {
        super(p); 
    }

    /**
     * Get the role of the employee, which is "Admin."
     * 
     * @return The role of the employee.
     */
    @Override
    public String getRole() {
        return "Admin";
    }
}
