/**
 * Represents a directory of user accounts.
 * Manages the creation, retrieval, and authentication of user accounts.
 */
package TheBusiness.UserAccountManagement;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Profile;
import java.util.ArrayList;

/**
 *
 * @author aadityakasbekar
 */
public class UserAccountDirectory {
    Business business;
    // ArrayList to store a list of user accounts
    private ArrayList<UserAccount> useraccountlist;

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }
    
    /**
     * Constructor to initialize the UserAccountDirectory with an empty list.
     */
    public UserAccountDirectory (Business b){
        this.business = b;
        useraccountlist = new ArrayList<>();
    }

    /**
     * Creates a new user account and adds it to the directory.
     * 
     * @param p The Profile object associated with the user account.
     * @param un The username for the new user account.
     * @param pw The password for the new user account.
     * @return The created UserAccount object.
     */
    public UserAccount newUserAccount(Profile p, String un, String pw) {
        UserAccount ua = new UserAccount(p, un, pw);
        useraccountlist.add(ua);
        return ua;
    }

    /**
     * Finds a user account in the directory based on the provided ID.
     * 
     * @param id The ID of the user account to be found.
     * @return The UserAccount object if found, otherwise returns null.
     */
    public UserAccount findUserAccount(String id) {
        for (UserAccount ua : useraccountlist) {
            if (ua.isMatch(id)) {
                return ua;
            }
        }
        return null; // not found after going through the whole list
    }

    /**
     * Authenticates a user based on the provided username and password.
     * 
     * @param un The username for authentication.
     * @param pw The password for authentication.
     * @return The authenticated UserAccount object if credentials are valid, otherwise returns null.
     */
    public UserAccount AuthenticateUser(String un, String pw) {
        for (UserAccount ua : useraccountlist) {
            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
        return null; // not found after going through the whole list
    }   
}
