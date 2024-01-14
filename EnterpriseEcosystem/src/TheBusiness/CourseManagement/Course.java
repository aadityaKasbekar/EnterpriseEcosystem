/**
 * Represents a course with relevant attributes such as course name, ID, etc.
 * This class encapsulates information about a specific course, including its name, ID, credit hours,
 * description, topic, term offered, region, language of instruction, and the professor assigned to it.
 */
package TheBusiness.CourseManagement;

import TheBusiness.EducationManagement.ProfessorProfile;


/**
 * Represents a course with relevant attributes such as course name, ID, etc.
 * 
 * @author Aaditya Kasbekar
 */
public class Course {

    // Attributes of the course
    private String courseName;
    private String courseID;
    private String termOfferedIn;
    private String region;
    private String language;
    private String courseDescription;
    private String courseTopic;
    private String creditHours;
    
    // Professor assigned to the course
    private ProfessorProfile professorProfile;

    /**
     * Gets the professor assigned to the course.
     * 
     * @return The ProfessorProfile object representing the professor assigned to the course.
     */
    public ProfessorProfile getProfessorProfile() {
        return professorProfile;
    }

    /**
     * Sets the professor assigned to the course.
     * 
     * @param professorProfile The ProfessorProfile object representing the professor to be assigned to the course.
     */
    public void setProfessorProfile(ProfessorProfile professorProfile) {
        this.professorProfile = professorProfile;
    }

    /**
     * Gets the credit hours of the course.
     * 
     * @return The credit hours of the course.
     */
    public String getCreditHours() {
        return creditHours;
    }

    /**
     * Sets the credit hours of the course.
     * 
     * @param creditHours The credit hours to be set for the course.
     */
    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * Gets the name of the course.
     * 
     * @return The name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the name of the course.
     * 
     * @param courseName The name to be set for the course.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Gets the ID of the course.
     * 
     * @return The ID of the course.
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * Sets the ID of the course.
     * 
     * @param courseID The ID to be set for the course.
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    /**
     * Gets the description of the course.
     * 
     * @return The description of the course.
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * Sets the description of the course.
     * 
     * @param courseDescription The description to be set for the course.
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * Gets the topic of the course.
     * 
     * @return The topic of the course.
     */
    public String getCourseTopic() {
        return courseTopic;
    }

    /**
     * Sets the topic of the course.
     * 
     * @param courseTopic The topic to be set for the course.
     */
    public void setCourseTopic(String courseTopic) {
        this.courseTopic = courseTopic;
    }

    /**
     * Gets the term in which the course is offered.
     * 
     * @return The term in which the course is offered.
     */
    public String getTermOfferedIn() {
        return termOfferedIn;
    }

    /**
     * Sets the term in which the course is offered.
     * 
     * @param termOfferedIn The term to be set for the course offering.
     */
    public void setTermOfferedIn(String termOfferedIn) {
        this.termOfferedIn = termOfferedIn;
    }

    /**
     * Gets the region in which the course is offered.
     * 
     * @return The region in which the course is offered.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region in which the course is offered.
     * 
     * @param region The region to be set for the course offering.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the language in which the course is taught.
     * 
     * @return The language in which the course is taught.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language in which the course is taught.
     * 
     * @param language The language to be set for the course instruction.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Returns a string representation of the course.
     * 
     * @return The course name.
     */
    @Override
    public String toString() {
        return courseName;
    }
}
