/*
 * This abstract class represents a profile for personnel.
 * It contains a reference to a Person and provides a method to get the person's role.
 */
package TheBusiness.Personnel;

/**
 * Represents an abstract profile for personnel.
 * 
 * This abstract class serves as a base class for various personnel profiles,
 * providing common functionality such as storing a reference to the associated person,
 * getting the role of the personnel, getting the associated person, and checking if the profile matches a given ID.
 * 
 * Subclasses are expected to implement the {@code getRole()} method to specify the role of the personnel.
 * 
 * 
 * @author Aaditya Kasbekar
 */
public abstract class Profile {

    /** Reference to the associated person. */
    Person person;

    /**
     * Constructs a new profile with the given person.
     *
     * @param p The person associated with the profile.
     */
    public Profile(Person p) {
        person = p;
    }

    /**
     * Gets the role of the personnel.
     *
     * @return The role of the personnel.
     */
    public abstract String getRole();

    /**
     * Gets the associated person.
     *
     * @return The associated person.
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Checks if the profile matches a given ID.
     *
     * @param id The ID to check for a match.
     * @return {@code true} if the IDs match, {@code false} otherwise.
     */
    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }
}
