/**
 * Represents a directory of courses.
 * It provides methods to manage a list of courses, including adding new courses, deleting courses,
 * and searching for a course by its ID.
 */
package TheBusiness.CourseManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 * Represents a directory of courses. It provides methods to manage a list of
 * courses, including adding new courses, deleting courses, and searching for a
 * course by its ID.
 *
 * @author Aaditya kasbekar
 */
public class CourseDirectory {

    Business business;
    // ArrayList to store a list of courses
    private ArrayList<Course> courseCatalog;

    /**
     * Constructor to initialize the CourseDirectory with an empty list.
     * @param b
     */
    public CourseDirectory(Business b) {
        this.business = b;
        this.courseCatalog = new ArrayList<>();
    }

    /**
     * Gets the list of courses in the directory.
     *
     * @return The ArrayList containing the list of courses.
     */
    public ArrayList<Course> getCourseCatalog() {
        return this.courseCatalog;
    }

    /**
     * Adds a new course to the course catalog.
     *
     * @param course The Course object to be added.
     */
    public void addCourse(Course course) {
        this.courseCatalog.add(course);
    }

    /**
     * Deletes a course from the course catalog.
     *
     * @param course The Course object to be deleted.
     */
    public void deleteCourse(Course course) {
        this.courseCatalog.remove(course);
    }

    /**
     * Searches for a course by its ID in the course catalog.
     *
     * @param courseID The ID of the course to be searched.
     * @return The Course object if found, otherwise returns null.
     */
    public Course searchCourse(String courseID) {
        for (Course course : courseCatalog) {
            if (course.getCourseID().equals(courseID)) {
                return course;
            }
        }
        return null; // not found after going through the whole list
    }
}
