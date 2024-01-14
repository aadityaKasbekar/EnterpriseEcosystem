/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Personnel.Enterprise1.Organization1;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
import java.util.ArrayList;

/**
 * Represents a directory of Hotel Staff profiles.
 * 
 * This class manages a list of HotelManagerProfile, FrontDeskStaffProfile, KitchenStaffProfile,
 * and HouseKeepingStaffProfile objects, providing methods to add, remove, and find hotel staff profiles based on their IDs.
 * 
 * 
 * @author sakshiwadaskar
 */
public class HotelStaffDirectory {

    /** The business associated with the directory. */
    Business business;

    /** ArrayList to store a list of Hotel Staff Profile objects. */
    ArrayList<Profile> hotelStaffList;

    /**
     * Constructs a new HotelStaffDirectory associated with the given business.
     *
     * @param b The business associated with the directory.
     */
    public HotelStaffDirectory(Business b) {
        this.business = b;
        hotelStaffList = new ArrayList();
    }

    /**
     * Gets the list of hotel staff profiles stored in the directory.
     *
     * @return The list of hotel staff profiles.
     */
    public ArrayList<Profile> getHotelStaffList() {
        return hotelStaffList;
    }

    /**
     * Adds a new HotelManagerProfile, FrontDeskStaffProfile, KitchenStaffProfile,
     * or HouseKeepingStaffProfile to the directory based on the provided person and staff type.
     *
     * @param p The person for whom the staff profile is created.
     * @param staffType The type of hotel staff profile to create (e.g., "Front Desk Staff").
     * @return The created hotel staff profile.
     */
    public Profile addNewStaff(Person p, String staffType) {
        if (staffType.equals("Front Desk Staff")) {
            FrontDeskStaffProfile sp = new FrontDeskStaffProfile(p);
            business.getPersonDirectory().newFrontDeskStaff(p);
            hotelStaffList.add(sp);
            return sp;
        }
        if (staffType.equals("Kitchen Staff")) {
            KitchenStaffProfile sp = new KitchenStaffProfile(p);
            business.getPersonDirectory().newKitchenStaff(p);
            hotelStaffList.add(sp);
            return sp;
        }
        if (staffType.equals("Housekeeping Staff")) {
            HouseKeepingStaffProfile sp = new HouseKeepingStaffProfile(p);
            business.getPersonDirectory().newHouseKeepingStaff(p);
            hotelStaffList.add(sp);
            return sp;
        }

        return null;
    }

    /**
     * Removes a hotel staff profile from the directory.
     *
     * @param profile The hotel staff profile to remove.
     */
    public void removeStaff(Profile profile) {
        this.hotelStaffList.remove(profile);
    }

    /**
     * Finds a hotel staff profile in the directory based on the provided ID.
     *
     * @param id The ID to search for.
     * @return The found hotel staff profile or {@code null} if not found.
     */
    public Profile findHotelStaff(String id) {
        // Iterate through the list of hotel staff profiles
        for (Profile sp : hotelStaffList) {
            // Check if the provided ID matches the ID of the current hotel staff profile
            if (sp.isMatch(id)) {
                // Return the matching hotel staff profile if found
                return sp;
            }
        }
        // Return null if no hotel staff profile with the provided ID is found in the directory
        return null; // not found after going through the whole list
    }
}
