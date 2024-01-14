/*
 * This class represents a report summarizing customer information.
 * It contains a list of CustomerSummary objects for aggregating and presenting customer performance data.
 */
package TheBusiness.CustomerManagement;

import java.util.ArrayList;

/**
 * Represents a report summarizing customer information.
 * 
 * @author Kal Bugrara
 */
public class CustomerReport {
    
    // ArrayList to store a list of CustomerSummary objects
    ArrayList<CustomerSummary> customerlist;
    
    // Constructor to initialize a CustomersReport with an empty list
    public CustomerReport(){
        customerlist = new ArrayList<>();
    }
    
    // Method to add a CustomerSummary to the report
    public void addCustomerSummary(CustomerSummary cs){
        customerlist.add(cs);
    }
}
