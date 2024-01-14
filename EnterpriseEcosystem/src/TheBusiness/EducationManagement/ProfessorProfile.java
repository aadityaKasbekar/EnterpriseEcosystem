package TheBusiness.EducationManagement;

import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import java.util.ArrayList;

/**
 * Represents a professor profile, extending the base Profile class.
 * Manages information about a professor's specialization, rating, and associated students.
 * 
 * The ProfessorProfile class provides methods to access and modify the professor's details,
 * such as rating, specialization, and the list of students associated with the professor.
 * 
 * @author Aaditya Kasbekar
 */
public class ProfessorProfile extends Profile {

    // Field to store the professor's specialization
    private String specialization;

    // Field to store the professor's rating
    private int rating;

    // List to store the students associated with the professor
    private ArrayList<StudentProfile> studentList;

    /**
     * Constructor to initialize a professor profile with a person.
     * 
     * @param p The associated Person object.
     */
    public ProfessorProfile(Person p) {
        super(p);
        this.studentList = new ArrayList<>();
    }

    /**
     * Gets the professor's rating.
     * 
     * @return The professor's rating.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the professor's rating to a randomly generated value between 1 and 5.
     */
    public void setRating() {
        this.rating = (int) (Math.random() * 5) + 1;
    }

    /**
     * Gets the professor's specialization.
     * 
     * @return The professor's specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the professor's specialization.
     * 
     * @param specialization The specialization to be set.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Gets the list of students associated with the professor.
     * 
     * @return The list of StudentProfile objects.
     */
    public ArrayList<StudentProfile> getStudentList() {
        return this.studentList;
    }

    /**
     * Adds a student to the professor's class.
     * 
     * @param sp The StudentProfile object to be added.
     */
    public void addStudentToClass(StudentProfile sp) {
        this.studentList.add(sp);
    }

    /**
     * Overrides the getRole method to specify the role as "Professor."
     * 
     * @return The role of the profile.
     */
    @Override
    public String getRole() {
        return "Professor";
    }

    /**
     * Overrides the isMatch method to check if the profile matches a given ID.
     * 
     * @param id The ID to be checked against.
     * @return True if the profile's ID matches the given ID, false otherwise.
     */
    @Override
    public boolean isMatch(String id) {
        return getPerson().getPersonId().equals(id);
    }
}