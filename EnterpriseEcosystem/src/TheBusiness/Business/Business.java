package TheBusiness.Business;

import TheBusiness.BookingManagement.BookingDirectory;
import TheBusiness.BookingManagement.RoomDirectory;
import TheBusiness.CourseManagement.CourseDirectory;
import TheBusiness.EducationManagement.ProfessorDirectory;
import TheBusiness.EducationManagement.StudentDirectory;
import TheBusiness.OrderManagement.OrderDirectory;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelStaffDirectory;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerDirectory;
import TheBusiness.Personnel.Enterprise1.Organization2.SalesPersonDirectory;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.UserAccountManagement.UserAccountDirectory;

/**
 * Represents a business entity with various directories for managing personnel,
 * courses, and user accounts. Includes directories for professors, students,
 * employees, user accounts, courses, hotel managers, and front desk staff.
 *
 * The Business class acts as the central entity for managing different aspects
 * of an educational or hotel business.
 *
 * @author Aaditya Kasbekar
 */
public class Business {

    String name;
    PersonDirectory persondirectory; // all people profiles regardless of the role
    ProfessorDirectory professorDirectory;
    StudentDirectory studentdirectory;
    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    CourseDirectory courseDirectory;
    HotelManagerDirectory hotelmanagerDirectory;
    HotelStaffDirectory hotelStaffDirectory;
    ProductCatalog hospitalitySupplierProductCatalog;
    SalesPersonDirectory salesPersondirectory;
    ProductCatalog hotelSupplyInventory;
    RoomDirectory hotelRoomDirectory;
    BookingDirectory hotelRoomBookings;
    OrderDirectory hotelHospitalityOrders;

    /**
     * Constructor to initialize a Business with a given name.
     *
     * @param n The name of the business.
     */
    public Business(String n) {
        name = n;
        persondirectory = new PersonDirectory(this);
        professorDirectory = new ProfessorDirectory(this);
        studentdirectory = new StudentDirectory(this);
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory(this);
        courseDirectory = new CourseDirectory(this);
        hotelmanagerDirectory = new HotelManagerDirectory(this);
        hotelStaffDirectory = new HotelStaffDirectory(this);
        salesPersondirectory = new SalesPersonDirectory(this);
        hospitalitySupplierProductCatalog = new ProductCatalog(this);
        hotelSupplyInventory = new ProductCatalog(this);
        hotelRoomDirectory = new RoomDirectory(this);
        hotelRoomBookings = new BookingDirectory(this);
        hotelHospitalityOrders = new OrderDirectory();
    }
    
    public OrderDirectory getHotelHospitalityOrders() {
        return this.hotelHospitalityOrders;
    }
    
    public RoomDirectory getHotelRoomDirectory() {
        return hotelRoomDirectory;
    }

    public BookingDirectory getHotelRoomBookings() {
        return hotelRoomBookings;
    }

    /**
     * Gets the directory for front desk staff within the business.
     *
     * @return The HotelStaffDirectory object.
     */
    public HotelStaffDirectory getHotelStaffDirectory() {
        return hotelStaffDirectory;
    }

    public ProductCatalog getHospitalitySupplierProductCatalog() {
        return hospitalitySupplierProductCatalog;
    }

    public void setHospitalitySupplierProductCatalog(ProductCatalog hospitalitySupplierProductCatalog) {
        this.hospitalitySupplierProductCatalog = hospitalitySupplierProductCatalog;
    }

    public SalesPersonDirectory getSalesPersondirectory() {
        return salesPersondirectory;
    }

    public void setSalesPersondirectory(SalesPersonDirectory salesPersondirectory) {
        this.salesPersondirectory = salesPersondirectory;
    }

    public ProductCatalog getHotelSupplyInventory() {
        return this.hotelSupplyInventory;
    }

    /**
     * Sets the directory for front desk staff within the business.
     *
     * @param hotelStaffDirectory The HotelStaffDirectory to be set.
     */
    public void setHotelStaffDirectory(HotelStaffDirectory hotelStaffDirectory) {
        this.hotelStaffDirectory = hotelStaffDirectory;
    }

    /**
     * Gets the directory for professors within the business.
     *
     * @return The ProfessorDirectory object.
     */
    public ProfessorDirectory getProfessorDirectory() {
        return professorDirectory;
    }

    /**
     * Gets the directory for students within the business.
     *
     * @return The StudentDirectory object.
     */
    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    /**
     * Gets the directory for courses within the business.
     *
     * @return The CourseDirectory object.
     */
    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    /**
     * Gets the directory for people within the business, regardless of their
     * role.
     *
     * @return The PersonDirectory object.
     */
    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    /**
     * Gets the directory for user accounts within the business.
     *
     * @return The UserAccountDirectory object.
     */
    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    /**
     * Gets the directory for employees within the business.
     *
     * @return The EmployeeDirectory object.
     */
    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    /**
     * Gets the directory for hotel managers within the business.
     *
     * @return The HotelManagerDirectory object.
     */
    public HotelManagerDirectory getHotelManagerDirectory() {
        return hotelmanagerDirectory;
    }

    /**
     * Sets the directory for hotel managers within the business.
     *
     * @param hotelmanagerDirectory The HotelManagerDirectory to be set.
     */
    public void setHotelManagerDirectory(HotelManagerDirectory hotelmanagerDirectory) {
        this.hotelmanagerDirectory = hotelmanagerDirectory;
    }
}
