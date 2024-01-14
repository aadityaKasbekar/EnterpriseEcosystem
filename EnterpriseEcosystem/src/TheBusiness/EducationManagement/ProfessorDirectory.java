/*
 * This class represents a directory of professors.
 * It provides methods to manage a list of professors, including adding new professor profiles and finding professor profiles by ID.
 */
package TheBusiness.EducationManagement;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Person;
import java.util.ArrayList;

/**
 * Represents a directory of professors. Provides methods to manage a list of
 * professors, including adding new professor profiles and finding professor
 * profiles by ID.
 *
 * @author Aaditya Kasbekar
 */
public class ProfessorDirectory {

    Business business;

    // ArrayList to store a list of professor profiles
    private ArrayList<ProfessorProfile> professorList;

    // Constructor to initialize the ProfessorDirectory with an empty list
    public ProfessorDirectory(Business b) {
        this.business = b;
        professorList = new ArrayList<>();
    }

    // Method to create a new professor profile and add it to the directory
    public ProfessorProfile newProfessorProfile(Person p) {
        // Add the new professor profile to the list
        ProfessorProfile pp = new ProfessorProfile(p);
        professorList.add(pp);
        // Return the newly created professor profile
        return pp;
    }

    // Method to find a professor profile in the directory based on the provided ID
    public ProfessorProfile findProfessor(String id) {
        // Iterate through the list of professor profiles
        for (ProfessorProfile pp : professorList) {
            // Check if the provided ID matches the ID of the current professor profile
            if (pp.getPerson().getPersonId().equals(id)) {
                // Return the matching professor profile if found
                return pp;
            }
        }
        // Return null if no professor profile with the provided ID is found in the directory
        return null; // not found after going through the whole list
    }
}
