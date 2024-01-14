/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Personnel.Enterprise1.Organization2;

import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.Profile;
/**
 *
 * @author sakshiwadaskar
 */
public class SalesPersonProfile extends Profile {
    
        public SalesPersonProfile(Person p) {
        super(p);
    }

    // Override the getRole method to specify the role as "Admin"
    @Override    
    public String getRole() {
        return "Sales Person";
    }
    
   
}
