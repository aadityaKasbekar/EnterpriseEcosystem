/**
 * Represents a user account associated with a specific profile.
 * Manages user authentication using a username and password.
 */
package TheBusiness.UserAccountManagement;

import TheBusiness.Personnel.Profile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aadityakasbekar
 */
public class UserAccount {

    // Profile associated with the user account
    Profile profile;

    // Username for authentication
    String username;

    // Password for authentication
    String password;

    private List<String> oldPasswords;

    /**
     * Constructor to initialize a UserAccount with a profile, username, and
     * password.
     *
     * @param profile The Profile object associated with the user account.
     * @param un The username for authentication.
     * @param pw The password for authentication.
     */
    public UserAccount(Profile profile, String un, String pw) {
        username = un;
        //password = pw;
        setPassword(pw);
        this.profile = profile;
        this.oldPasswords = new ArrayList<>();
    }

    /**
     * Gets the person ID associated with the user account's profile.
     *
     * @return The person ID.
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        hashPassword(password);
//        this.password = password;
    }

    // Utility method to convert a byte array to a hexadecimal string
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    private void hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash1 = md.digest(password.getBytes());
            String hashedPwdString = bytesToHex(hash1);
            System.out.println("Hash 1: " + hashedPwdString);
            this.password = hashedPwdString;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    /**
     * Checks if the user account matches the provided ID.
     *
     * @param id The ID to compare with the user account's person ID.
     * @return True if the IDs match, otherwise false.
     */
    public boolean isMatch(String id) {
        return getPersonId().equals(id);
    }

    /**
     * Validates if the provided username and password match the user account
     * credentials.
     *
     * @param un The username for validation.
     * @param pw The password for validation.
     * @return True if the credentials are valid, otherwise false.
     */
    public boolean IsValidUser(String un, String pw) {
        return username.equalsIgnoreCase(un) && password.equals(pw);
    }

    /**
     * Gets the role associated with the user account's profile.
     *
     * @return The role of the associated profile.
     */
    public String getRole() {
        return profile.getRole();
    }

    /**
     * Gets the Profile object associated with the user account.
     *
     * @return The associated Profile object.
     */
    public Profile getAssociatedPersonProfile() {
        return profile;
    }

    public List getOldPasswordList() {
        return this.oldPasswords;
    }

    public void addOldPasswordToPasswordList(String password) {
        this.oldPasswords.add(password);
    }
}
