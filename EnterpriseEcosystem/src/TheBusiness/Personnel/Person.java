/*
 * This is a simple Java class representing a Person.
 * It has a constructor to initialize a Person with an ID.
 * The class provides methods to get the person's ID, check if it matches a given ID, and a toString method.
 */
package TheBusiness.Personnel;
import java.time.LocalDate;
import java.time.Period;

/**
 * Represents a person with an ID.
 *
 * This class provides basic information about a person, including ID, name,
 * date of birth, gender, age, and phone number. It also includes methods to set
 * and get each attribute, check if a given ID matches, and provide a string
 * representation.
 *
 *
 * @author Aaditya Kasbekar
 */
public class Person {

    // Fields to store information about the person
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String age;
    private String phoneNumber;

    /**
     * Constructs a new Person with the given ID.
     *
     * @param id The ID to assign to the person.
     */
    public Person(String id) {
        this.id = id;
    }

    /**
     * Gets the ID of the person.
     *
     * @return The ID of the person.
     */
    public String getPersonId() {
        return id;
    }

    /**
     * Sets the ID of the person.
     *
     * @param id The ID to set.
     */
    public void setPersonId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the date of birth of the person.
     *
     * @return The date of birth of the person.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the person.
     *
     * @param dateOfBirth The date of birth to set.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the gender of the person.
     *
     * @return The gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender The gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age The age to set.
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * Sets the phone number of the person.
     *
     * @param phoneNumber The phone number to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the phone number of the person.
     *
     * @return The phone number of the person.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Checks if the given ID matches the person's ID.
     *
     * @param id The ID to check for a match.
     * @return {@code true} if the IDs match, {@code false} otherwise.
     */
    public boolean isMatch(String id) {
        return getPersonId().equals(id);
    }

    /**
     * Calculates and returns the age based on the date of birth.
     *
     * @return The age of the person as a string.
     */
    public String calculateAge() {
        // Parse the date of birth string to LocalDate
        LocalDate birthDate = LocalDate.parse(dateOfBirth);

        // Calculate the age using the current date
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        // Convert the age to a string
        return String.valueOf(period.getYears());
    }

    /**
     * Gets a string representation of the person (returns the person's ID).
     *
     * @return A string representation of the person.
     */
    @Override
    public String toString() {
        return getPersonId();
    }
}
