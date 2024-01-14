/*
 * This class represents an employee profile, extending the base Profile class.
 * It specifies the role as "Admin" for employees.
 */
package TheBusiness.Personnel;

/**
 * Represents an employee profile, extending the base Profile class.
 * 
 * @author Aaditya Kasbekar
 */
public class EmployeeProfile extends Profile {

    // Constructor to initialize an employee profile with a person
    public EmployeeProfile(Person p) {
        super(p);
    }

    // Override the getRole method to specify the role as "Admin"
    @Override
    public String getRole() {
        return "Admin";
    }
}
