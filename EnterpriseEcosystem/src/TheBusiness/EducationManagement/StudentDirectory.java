/*
 * This class represents a directory of student profiles.
 * It provides methods to manage a list of students, including adding new students and finding students by ID.
 */
package TheBusiness.EducationManagement;


import TheBusiness.Business.Business;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a directory of student profiles. Provides methods to manage a list
 * of students, including adding new students and finding students by ID.
 *
 * @author Aaditya Kasbekar
 */
public class StudentDirectory {
    Business business;
    // ArrayList to store a list of student profiles
    private ArrayList<StudentProfile> studentlist;

    // Constructor to initialize the StudentDirectory with an empty list
    public StudentDirectory(Business b) {
        this.business = b;
        studentlist = new ArrayList<>();
    }

    // Method to get the list of student profiles
    public List<StudentProfile> getStudentList() {
        return this.studentlist;
    }

    // Method to create a new student profile and add it to the directory
    public StudentProfile newStudentProfile(Person p) {
        // Add the new student profile to the list
       StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        // Return the newly created student profile
        return sp;
    }

    // Method to find a student profile in the directory based on the provided ID
    public StudentProfile findStudent(String id) {
        // Iterate through the list of student profiles
        for (StudentProfile sp : studentlist) {
            // Check if the provided ID matches the ID of the current student profile
            if (sp.getPerson().getPersonId().equals(id)) {
                // Return the matching student profile if found
                return sp;
            }
        }
        // Return null if no student profile with the provided ID is found in the directory
        return null; // not found after going through the whole list
    }
}
