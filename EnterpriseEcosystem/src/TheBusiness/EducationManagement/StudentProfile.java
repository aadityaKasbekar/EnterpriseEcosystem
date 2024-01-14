/*
 * This class represents a student profile, extending the base Profile class.
 * It contains information about student courses, grades, and provides methods to analyze academic performance.
 */
package TheBusiness.EducationManagement; // Update the package name as needed

import TheBusiness.CourseManagement.Course;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import java.util.ArrayList;

/**
 * Represents a student profile, extending the base Profile class.
 * Manages information about a student's enrolled courses, grades, and graduation status.
 * 
 * The StudentProfile class provides methods to access and modify the student's details,
 * such as the list of registered courses, assigned grades, and graduation status.
 * 
 * @author Aaditya Kasbekar
 */
public class StudentProfile extends Profile {

    // List to store the courses the student is enrolled in
    private ArrayList<Course> registeredCourseList;

    // List to store the course-GPA pairs
    private ArrayList<GPAEntry> gpaList; // Custom class to represent course-GPA pair

    // Flag to indicate whether the student has graduated
    private boolean isGraduated;

    /**
     * Constructor to initialize a student profile with a person.
     * 
     * @param p The associated Person object.
     */
    public StudentProfile(Person p) {
        super(p);
        this.registeredCourseList = new ArrayList<>();
        this.gpaList = new ArrayList<>();
        this.isGraduated = false;
    }

    /**
     * Enrolls the student in a course.
     * 
     * @param course The Course object to be added to the list of registered courses.
     */
    public void enrollToCourse(Course course) {
        this.registeredCourseList.add(course);
    }

    /**
     * Gets the list of registered courses for the student.
     * 
     * @return The list of Course objects.
     */
    public ArrayList<Course> getRegisteredCourseList() {
        return this.registeredCourseList;
    }

    /**
     * Assigns a grade to a course and adds the course-GPA pair to the list.
     * 
     * @param course The Course object for which the GPA is assigned.
     * @param gpa The GPA to be assigned to the course.
     */
    public void assignGradeByCourse(Course course, int gpa) {
        GPAEntry entry = new GPAEntry(course, gpa);
        gpaList.add(entry);
    }

    /**
     * Gets the list of course-GPA pairs for the student.
     * 
     * @return The list of GPAEntry objects representing course-GPA pairs.
     */
    public ArrayList<GPAEntry> getGpaList() {
        return this.gpaList;
    }

    /**
     * Checks if the student has graduated.
     * 
     * @return True if the student has graduated, false otherwise.
     */
    public boolean isGraduated() {
        if (registeredCourseList.size() >= 2) {
            this.isGraduated = true;
        }
        return isGraduated;
    }

    /**
     * Sets the graduation status of the student.
     * 
     * @param isGraduated The graduation status to be set.
     */
    public void setGraduated(boolean isGraduated) {
        this.isGraduated = isGraduated;
    }

    /**
     * Overrides the getRole method to specify the role as "Student."
     * 
     * @return The role of the profile.
     */
    @Override
    public String getRole() {
        return "Student";
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

    /**
     * Custom class to represent course-GPA pair.
     */
    private static class GPAEntry {
        private Course course;
        private int gpa;

        /**
         * Constructor to initialize a GPAEntry with a course and GPA.
         * 
         * @param course The associated Course object.
         * @param gpa The GPA value.
         */
        public GPAEntry(Course course, int gpa) {
            this.course = course;
            this.gpa = gpa;
        }

        /**
         * Gets the course associated with the GPAEntry.
         * 
         * @return The Course object.
         */
        public Course getCourse() {
            return course;
        }

        /**
         * Gets the GPA associated with the GPAEntry.
         * 
         * @return The GPA value.
         */
        public int getGpa() {
            return gpa;
        }
    }
}