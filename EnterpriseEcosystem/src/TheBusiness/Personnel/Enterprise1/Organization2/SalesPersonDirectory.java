/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Personnel.Enterprise1.Organization2;

import TheBusiness.Business.Business;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.Personnel.Person;
import java.util.ArrayList;

/**
 *
 * @author sakshiwadaskar
 */
public class SalesPersonDirectory {
    
        Business business;

    // ArrayList to store a list of HotelManagerProfile objects
    ArrayList<SalesPersonProfile> salesPersonlist;

    // Constructor to initialize the EmployeeDirectory with a business and an empty list of employee profiles
    public SalesPersonDirectory(Business b) {
        this.business = b;
        salesPersonlist = new ArrayList();
    }

    // Method to create a new HotelManagerProfile with the given person and add it to the directory
    public SalesPersonProfile newSalesPersonProfile(Person p) {
        // Create a new HotelManagerProfile object
        SalesPersonProfile sp = new SalesPersonProfile(p);
        // Add the new EmployeeProfile to the list
        salesPersonlist.add(sp);
        business.getPersonDirectory().newHotelManager(p);
        return sp;
    }

    // Method to find an EmployeeProfile in the directory based on the provided ID
    public SalesPersonProfile findSalesPerson(String id) {
        // Iterate through the list of employee profiles
        for (SalesPersonProfile sp : salesPersonlist) {
            // Check if the provided ID matches the ID of the current employee profile
            if (sp.isMatch(id)) {
                // Return the matching employee profile if found
                return sp;
            }
        }
        // Return null if no employee profile with the provided ID is found in the directory
        return null; // not found after going through the whole list
    }


}
