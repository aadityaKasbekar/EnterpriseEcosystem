/*
 * This class represents a directory of Person objects.
 * It provides methods to manage a list of persons, including adding new persons and finding persons by ID.
 */
package TheBusiness.Personnel;

import TheBusiness.Business.Business;
import TheBusiness.EducationManagement.ProfessorProfile;
import TheBusiness.EducationManagement.StudentProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.FrontDeskStaffProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.HouseKeepingStaffProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.KitchenStaffProfile;
import java.util.ArrayList;

/**
 * Represents a directory of Person objects.
 * 
 * his class manages a list of profiles, including StudentProfile, ProfessorProfile,
 * FrontDeskStaffProfile, HouseKeepingStaffProfile, KitchenStaffProfile, and HotelManagerProfile,
 * providing methods to create new profiles and find profiles based on their IDs.
 * 
 * 
 * @author Aaditya Kasbekar
 */
public class PersonDirectory {

    /** The list of profiles stored in the directory. */
    ArrayList<Profile> personlist;

    /** The business associated with the directory. */
    Business business;

    /**
     * Constructs a new PersonDirectory associated with the given business.
     *
     * @param b The business associated with the directory.
     */
    public PersonDirectory(Business b) {
        this.business = b;
        personlist = new ArrayList();
    }

    /**
     * Gets the list of profiles stored in the directory.
     *
     * @return The list of profiles.
     */
    public ArrayList<Profile> getPersonlist() {
        return personlist;
    }

    /**
     * Creates a new StudentProfile for the given person and role.
     *
     * @param p The person for whom the profile is created.
     * @param role The role of the profile (e.g., "Student").
     * @return The created StudentProfile.
     */
    public StudentProfile newStudent(Person p, String role) {
        StudentProfile profile = new StudentProfile(p);
        personlist.add(profile);
        return profile;
    }

    /**
     * Creates a new ProfessorProfile for the given person and role.
     *
     * @param p The person for whom the profile is created.
     * @param role The role of the profile (e.g., "Professor").
     * @return The created ProfessorProfile.
     */
    public ProfessorProfile newFaculty(Person p, String role) {
        ProfessorProfile profile = new ProfessorProfile(p);
        personlist.add(profile);
        return profile;
    }

    /**
     * Creates a new FrontDeskStaffProfile for the given person.
     *
     * @param p The person for whom the profile is created.
     * @return The created FrontDeskStaffProfile.
     */
    public FrontDeskStaffProfile newFrontDeskStaff(Person p) {
        FrontDeskStaffProfile profile = new FrontDeskStaffProfile(p);
        personlist.add(profile);
        return profile;
    }

    /**
     * Creates a new HouseKeepingStaffProfile for the given person.
     *
     * @param p The person for whom the profile is created.
     * @return The created HouseKeepingStaffProfile.
     */
    public HouseKeepingStaffProfile newHouseKeepingStaff(Person p) {
        HouseKeepingStaffProfile profile = new HouseKeepingStaffProfile(p);
        personlist.add(profile);
        return profile;
    }

    /**
     * Creates a new KitchenStaffProfile for the given person.
     *
     * @param p The person for whom the profile is created.
     * @return The created KitchenStaffProfile.
     */
    public KitchenStaffProfile newKitchenStaff(Person p) {
        KitchenStaffProfile profile = new KitchenStaffProfile(p);
        personlist.add(profile);
        return profile;
    }

    /**
     * Creates a new HotelManagerProfile for the given person.
     *
     * @param p The person for whom the profile is created.
     * @return The created HotelManagerProfile.
     */
    public HotelManagerProfile newHotelManager(Person p) {
        HotelManagerProfile profile = new HotelManagerProfile(p);
        personlist.add(profile);
        return profile;
    }

    /**
     * Finds a profile in the directory based on the given ID.
     *
     * @param id The ID to search for.
     * @return The found profile or {@code null} if not found.
     */
    public Profile findPerson(String id) {
        for (Profile p : personlist) {
            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
}
