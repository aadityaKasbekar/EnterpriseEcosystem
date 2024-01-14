/*
 * This class provides a template for configuring a business.
 * It serves as a starting point for defining the configuration settings and setup procedures.
 * TODO: Add specific methods and logic to configure the business.
 */
package UserInterface.Main;

import TheBusiness.BookingManagement.Booking;
import TheBusiness.BookingManagement.BookingDirectory;
import TheBusiness.BookingManagement.Room;
import TheBusiness.BookingManagement.RoomDirectory;
import TheBusiness.Business.Business;
import TheBusiness.CourseManagement.Course;
import TheBusiness.CourseManagement.CourseDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.EducationManagement.ProfessorDirectory;
import TheBusiness.EducationManagement.ProfessorProfile;
import TheBusiness.EducationManagement.StudentDirectory;
import TheBusiness.EducationManagement.StudentProfile;
import TheBusiness.Personnel.EmployeeDirectory;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.FrontDeskStaffProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerDirectory;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelManagerProfile;
import TheBusiness.Personnel.Enterprise1.Organization1.HotelStaffDirectory;
import TheBusiness.Personnel.Enterprise1.Organization2.SalesPersonDirectory;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.Personnel.Profile;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;

/**
 * A class for configuring a business.
 *
 * @author Aaditya Kasbekar
 */
class ConfigureABusiness {

    /**
     * Initializes and configures a business with sample data.
     *
     * @return The configured business instance.
     */
    static Business initialize() {
        // TODO: Add configuration methods and properties here.

        // Creating a new business instance
        Business business = new Business("Hotel Mangement Ecosystem");

        // Accessing the User Account Directory from the Business
        UserAccountDirectory userAccountDirectory = business.getUserAccountDirectory();

        // Accessing the person directory from the business
        PersonDirectory persondirectory = business.getPersonDirectory();

        // Creating admin profiles to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        Person adminPerson = new Person("admin");

        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(adminPerson);
        UserAccount ua3 = userAccountDirectory.newUserAccount(employeeprofile0, "admin", "1234");
//========================================================================================================================================
        // Hotel Manager Registration
        HotelManagerDirectory hotelManagerDirectory = business.getHotelManagerDirectory();
        Person hotelManagerPerson = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        hotelManagerPerson.setName("Harish");
        hotelManagerPerson.setAge("23");
        hotelManagerPerson.setGender("Male");
        hotelManagerPerson.setPhoneNumber("3747575888");
        HotelManagerProfile hotelManagerProfile = hotelManagerDirectory.newHotelManagerProfile(hotelManagerPerson);
        UserAccount hotelManagerAccount = userAccountDirectory.newUserAccount(hotelManagerProfile, "hm", "hm");

        // Create Hotel Staff Profiles
        HotelStaffDirectory hotelStaffDirectory = business.getHotelStaffDirectory();
        Person frontDeskStaff1 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        frontDeskStaff1.setName("Adarsh");
        frontDeskStaff1.setAge("23");
        frontDeskStaff1.setGender("Male");
        frontDeskStaff1.setPhoneNumber("3747575888");
        Profile frontDeskStaffProfile1 = hotelStaffDirectory.addNewStaff(frontDeskStaff1, "Front Desk Staff");
        UserAccount frontDeskStaffUserAcc1 = userAccountDirectory.newUserAccount(frontDeskStaffProfile1, "adarsh", "adarsh");

        Person frontDeskStaff2 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        frontDeskStaff2.setName("Shivam");
        frontDeskStaff2.setAge("25");
        frontDeskStaff2.setGender("Male");
        frontDeskStaff2.setPhoneNumber("298330888");
        Profile frontDeskStaffProfile2 = hotelStaffDirectory.addNewStaff(frontDeskStaff2, "Front Desk Staff");
        UserAccount frontDeskStaffUserAcc2 = userAccountDirectory.newUserAccount(frontDeskStaffProfile2, "shivam", "shivam");

        Person housekeepingStaff1 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        housekeepingStaff1.setName("Mal");
        housekeepingStaff1.setAge("27");
        housekeepingStaff1.setGender("Female");
        housekeepingStaff1.setPhoneNumber("78898330888");
        Profile housekeepingStaffProfile1 = hotelStaffDirectory.addNewStaff(housekeepingStaff1, "Housekeeping Staff");
        UserAccount housekeepingStaffUserAcc1 = userAccountDirectory.newUserAccount(housekeepingStaffProfile1, "mal", "mal");
//========================================================================================================================================
        //SalesPersons
        Person salesPerson1 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        salesPerson1.setName("sales person");
        SalesPersonDirectory salesPersonDirectory = business.getSalesPersondirectory();

        Profile salesPersonProfile1 = salesPersonDirectory.newSalesPersonProfile(salesPerson1);
        UserAccount salesPersonUserAcc1 = userAccountDirectory.newUserAccount(salesPersonProfile1, "salesperson", "sales");

        ProductDirectory supplierProductCatalog = business.getHospitalitySupplierProductCatalog();

        Product product1 = new Product("Towel Set", 20, 100);
        supplierProductCatalog.addProduct(product1);
        product1.setId(String.valueOf(supplierProductCatalog.getProductList().size() + 1000));
        Product product2 = new Product("Soap", 10, 500);
        supplierProductCatalog.addProduct(product2);
        product2.setId(String.valueOf(supplierProductCatalog.getProductList().size() + 1000));
        Product product3 = new Product("Bedsheets", 20, 300);
        supplierProductCatalog.addProduct(product3);
        product3.setId(String.valueOf(supplierProductCatalog.getProductList().size() + 1000));
//========================================================================================================================================
        // Customers:
        Person customer1 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        customer1.setName("Sakshi");
        Profile custProf1 = new CustomerProfile(customer1);
        UserAccount custAcc1 = userAccountDirectory.newUserAccount(custProf1, "sak", "sak");

        Person customer2 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        customer2.setName("Shubha");
        Profile custProf2 = new CustomerProfile(customer2);
        UserAccount custAcc2 = userAccountDirectory.newUserAccount(custProf2, "shu", "shu");
//========================================================================================================================================
        //Hotel Rooms
        Room suite = new Room("1001", "Suite", 2000, 10);
        Room superDeluxe = new Room("1002", "Super Deluxe", 1200, 15);
        Room deluxe = new Room("1003", "Deluxe", 800, 20);
        Room standard = new Room("1004", "Standard", 500, 30);
        RoomDirectory roomDirectory = business.getHotelRoomDirectory();
        roomDirectory.addRoom(suite);
        roomDirectory.addRoom(superDeluxe);
        roomDirectory.addRoom(deluxe);
        roomDirectory.addRoom(standard);
//========================================================================================================================================
        //Bookings:
        BookingDirectory bookingDir = business.getHotelRoomBookings();
        Booking booking1 = new Booking(String.valueOf(bookingDir.getBookingList().size() + 1000), (CustomerProfile) custProf1);

        booking1.addRoomBooked(deluxe, 3);
        booking1.addRoomBooked(suite, 2);
        booking1.addRoomBooked(standard, 10);
        booking1.addRoomBooked(superDeluxe, 5);

        bookingDir.addBooking(booking1);

        Booking booking2 = new Booking(String.valueOf(bookingDir.getBookingList().size() + 1000), (CustomerProfile) custProf1);
        booking2.addRoomBooked(deluxe, 1);
        booking2.addRoomBooked(suite, 1);
        bookingDir.addBooking(booking2);

//========================================================================================================================================
        // Create Orders:
        
//========================================================================================================================================
        // Creating a new Faculty Person
        Person facultyPerson = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        facultyPerson.setName("Kal Bugrara");
        facultyPerson.setDateOfBirth("09/07/1998");
        facultyPerson.setGender("Male");
        facultyPerson.setAge(facultyPerson.calculateAge());
        facultyPerson.setPhoneNumber("883883092");
        
        Person facultyPerson2 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        facultyPerson2.setName("Manuel Montrond");
        facultyPerson2.setDateOfBirth("23/11/1998");
        facultyPerson2.setGender("Male");
        facultyPerson2.setAge(facultyPerson2.calculateAge());
        facultyPerson2.setPhoneNumber("280932388");
        
        Person facultyPerson3 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        facultyPerson3.setName("Jessica Fischer");
        facultyPerson3.setDateOfBirth("14/02/2020");
        facultyPerson3.setGender("Female");
        facultyPerson3.setAge(facultyPerson3.calculateAge());
        facultyPerson3.setPhoneNumber("832388209");
        
        Person facultyPerson4 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        facultyPerson4.setName("Dino Constantino");
        facultyPerson4.setDateOfBirth("24/05/1999");
        facultyPerson4.setGender("Male");
        facultyPerson4.setAge(facultyPerson4.calculateAge());
        facultyPerson4.setPhoneNumber("983208823");
        
        Person facultyPerson5 = new Person("Faculty" + String.valueOf(persondirectory.getPersonlist().size() + 1));
        facultyPerson5.setName("Ketan Kulkarni");
        facultyPerson5.setDateOfBirth("27/08/1998");
        facultyPerson5.setGender("Male");
        facultyPerson5.setAge(facultyPerson5.calculateAge());
        facultyPerson5.setPhoneNumber("232382389");

        // Creating a Professor Profile for the Faculty Person
        ProfessorProfile professorProfile = persondirectory.newFaculty(facultyPerson, "Faculty");
        professorProfile.setRating();
        
        ProfessorProfile professorProfile2 = persondirectory.newFaculty(facultyPerson2, "Faculty");
        professorProfile.setRating();
        
        ProfessorProfile professorProfile3 = persondirectory.newFaculty(facultyPerson3, "Faculty");
        professorProfile.setRating();
        
        ProfessorProfile professorProfile4 = persondirectory.newFaculty(facultyPerson4, "Faculty");
        professorProfile.setRating();
        
        ProfessorProfile professorProfile5 = persondirectory.newFaculty(facultyPerson5, "Faculty");
        professorProfile.setRating();

        // Accessing the Professor Directory from the Business and adding professor to PreofessorDir
        ProfessorDirectory professorDirectory = business.getProfessorDirectory();
        professorDirectory.newProfessorProfile(facultyPerson);
        professorDirectory.newProfessorProfile(facultyPerson2);
        professorDirectory.newProfessorProfile(facultyPerson3);
        professorDirectory.newProfessorProfile(facultyPerson4);
        professorDirectory.newProfessorProfile(facultyPerson5);

        // Creating a User Account for the Faculty Person
        UserAccount facultyUserAccount = userAccountDirectory.newUserAccount(professorProfile, "Kal", "kal");
        UserAccount facultyUserAccount2 = userAccountDirectory.newUserAccount(professorProfile2, "Manuel", "man");
        UserAccount facultyUserAccount3 = userAccountDirectory.newUserAccount(professorProfile3, "Jessica", "jes");
        UserAccount facultyUserAccount4 = userAccountDirectory.newUserAccount(professorProfile4, "Dino", "din");
        UserAccount facultyUserAccount5 = userAccountDirectory.newUserAccount(professorProfile5, "Ketan", "ket");

//========================================================================================================================================
        //Create courses
        
        CourseDirectory coursedirectory = business.getCourseDirectory();
        
        Course course = new Course();
        course.setCourseID("1001");
        course.setCourseName("DMDD");
        course.setProfessorProfile((ProfessorProfile) professorProfile);
        course.setCourseTopic("Databases");
        course.setLanguage("English");
        course.setTermOfferedIn("Fall 2023");
        course.setRegion("Boston");
        course.setCreditHours("4");
        course.setCourseDescription("This deals with SQL");
        coursedirectory.getCourseCatalog().add(course);

        Course course2 = new Course();
        course2.setCourseID("1002");
        course2.setCourseName("AED");
        course2.setProfessorProfile((ProfessorProfile) professorProfile);
        course2.setCourseTopic("Software Engineering");
        course2.setLanguage("English");
        course2.setTermOfferedIn("Fall 2023");
        course2.setRegion("Boston");
        course2.setCreditHours("4");
        course2.setCourseDescription("Java App Development");
        coursedirectory.getCourseCatalog().add(course2);
        
        Course course3 = new Course();
        course3.setCourseID("1003");
        course3.setCourseName("AED Lab");
        course.setProfessorProfile((ProfessorProfile) professorProfile2);
        course3.setCourseTopic("Software Engineering");
        course3.setLanguage("English");
        course3.setTermOfferedIn("Fall 2023");
        course3.setRegion("Seatle");
        course3.setCreditHours("4");
        course3.setCourseDescription("Java App Development Hands On");
        coursedirectory.getCourseCatalog().add(course3);

        Course course4 = new Course();
        course4.setCourseID("1004");
        course4.setCourseName("NMMT");
        course.setProfessorProfile((ProfessorProfile) professorProfile3);
        course4.setCourseTopic("Software Engineering");
        course4.setLanguage("English");
        course4.setTermOfferedIn("Fall 2023");
        course4.setRegion("Boston");
        course4.setCreditHours("4");
        course4.setCourseDescription("Neural Modeling Methods and Tools");
        coursedirectory.getCourseCatalog().add(course4);
//        
        Course course5 = new Course();
        course5.setCourseID("1005");
        course5.setCourseName("WEBDev");
        course.setProfessorProfile((ProfessorProfile) professorProfile4);
        course5.setCourseTopic("Software Engineering");
        course5.setLanguage("English");
        course5.setTermOfferedIn("Fall 2023");
        course5.setRegion("San Jose");
        course5.setCreditHours("4");
        course5.setCourseDescription("Web Design and User Experience Engineering");
        coursedirectory.getCourseCatalog().add(course5);
//        
        Course course6 = new Course();
        course6.setCourseID("1006");
        course6.setCourseName("PSA");
        course.setProfessorProfile((ProfessorProfile) professorProfile5);
        course6.setCourseTopic("Software Engineering");
        course6.setLanguage("English");
        course6.setTermOfferedIn("Fall 2023");
        course6.setRegion("San Jose");
        course6.setCreditHours("4");
        course6.setCourseDescription("Program Structure and Algorithms");
        coursedirectory.getCourseCatalog().add(course6);
//        
        Course course7 = new Course();
        course7.setCourseID("1007");
        course7.setCourseName("DSEP");
        course.setProfessorProfile((ProfessorProfile) professorProfile);
        course7.setCourseTopic("Databases");
        course7.setLanguage("English");
        course7.setTermOfferedIn("Fall 2023");
        course7.setRegion("Toronto");
        course7.setCreditHours("4");
        course7.setCourseDescription("Data Science Engineering with Python");
        coursedirectory.getCourseCatalog().add(course7);
//        
        Course course8 = new Course();
        course8.setCourseID("1008");
        course8.setCourseName("IDMP");
        course.setProfessorProfile((ProfessorProfile) professorProfile2);
        course8.setCourseTopic("Databases");
        course8.setLanguage("English");
        course8.setTermOfferedIn("Fall 2023");
        course8.setRegion("Toronto");
        course8.setCreditHours("4");
        course8.setCourseDescription("Intelligent Data Modeling and Presentation for Engineers");
        coursedirectory.getCourseCatalog().add(course8);

        Course course9 = new Course();
        course9.setCourseID("1009");
        course9.setCourseName("BDSIA");
        course.setProfessorProfile((ProfessorProfile) professorProfile3);
        course9.setCourseTopic("Databases");
        course9.setLanguage("English");
        course9.setTermOfferedIn("Fall 2023");
        course9.setRegion("Vancouver");
        course9.setCreditHours("4");
        course9.setCourseDescription("Big-Data Systems and Intelligence Analytics");
        coursedirectory.getCourseCatalog().add(course9);

        Course course10 = new Course();
        course10.setCourseID("1010");
        course10.setCourseName("BDAG");
        course.setProfessorProfile((ProfessorProfile) professorProfile4);
        course10.setCourseTopic("Databases");
        course10.setLanguage("English");
        course10.setTermOfferedIn("Fall 2023");
        course10.setRegion("Vancouver");
        course10.setCreditHours("4");
        course10.setCourseDescription("Big Data Architecture and Governance");
        coursedirectory.getCourseCatalog().add(course10);

//========================================================================================================================================
        //Create Students

        StudentDirectory studentDirectory = business.getStudentdirectory();

        Person studentPerson1 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson1.setName("Aaditya");
        studentPerson1.setAge("25");
        studentPerson1.setGender("Male");
        studentPerson1.setPhoneNumber("298330888");
        StudentProfile studentProfile1 = studentDirectory.newStudentProfile(studentPerson1);
        UserAccount studentAccount1 = userAccountDirectory.newUserAccount(studentProfile1, "Aaditya", "aaditya");
        //Student course Registration
        studentProfile1.getRegisteredCourseList().add(course3);
        studentProfile1.getRegisteredCourseList().add(course4);
        studentProfile1.getRegisteredCourseList().add(course5);
        studentProfile1.getRegisteredCourseList().add(course6);
        studentProfile1.getRegisteredCourseList().add(course7);
        studentProfile1.getRegisteredCourseList().add(course8);

        Person studentPerson2 = new Person("Student" + String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson2.setName("Sakshi Wadaskar");
        studentPerson2.setDateOfBirth("03/05/1998");
        studentPerson2.setGender("Female");
        StudentProfile studentProfile2 = persondirectory.newStudent(studentPerson2, "Student");
        UserAccount studentAccount2 = userAccountDirectory.newUserAccount(studentProfile2, "Sakshi", "sak");
        //Student course Registration
        studentProfile2.getRegisteredCourseList().add(course3);
        studentProfile2.getRegisteredCourseList().add(course4);
        studentProfile2.getRegisteredCourseList().add(course5);
        studentProfile2.getRegisteredCourseList().add(course6);
        studentProfile2.getRegisteredCourseList().add(course7);
        studentProfile2.getRegisteredCourseList().add(course8);

        Person studentPerson3 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson3.setName("Aaditya");
        studentPerson3.setAge("25");
        studentPerson3.setGender("Male");
        studentPerson3.setPhoneNumber("298330888");
        StudentProfile studentProfile3 = studentDirectory.newStudentProfile(studentPerson3);
        UserAccount studentAccount3 = userAccountDirectory.newUserAccount(studentProfile3, "Aayush", "aay");
        //Student course Registration
        studentProfile3.getRegisteredCourseList().add(course3);
        studentProfile3.getRegisteredCourseList().add(course4);
        studentProfile3.getRegisteredCourseList().add(course5);
        studentProfile3.getRegisteredCourseList().add(course6);
        studentProfile3.getRegisteredCourseList().add(course7);
        studentProfile3.getRegisteredCourseList().add(course8);

        Person studentPerson4 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson4.setName("Suchita");
        studentPerson4.setAge("25");
        studentPerson4.setGender("female");
        studentPerson4.setPhoneNumber("298330888");
        StudentProfile studentProfile4 = studentDirectory.newStudentProfile(studentPerson4);
        UserAccount studentAccount4 = userAccountDirectory.newUserAccount(studentProfile4, "Suchita", "suc");
        //Student course Registration
        studentProfile4.getRegisteredCourseList().add(course3);
        studentProfile4.getRegisteredCourseList().add(course4);
        studentProfile4.getRegisteredCourseList().add(course5);

        Person studentPerson5 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson5.setName("Pooja");
        studentPerson5.setAge("25");
        studentPerson5.setGender("female");
        studentPerson5.setPhoneNumber("29833888");
        StudentProfile studentProfile5 = studentDirectory.newStudentProfile(studentPerson5);
        UserAccount studentAccount5 = userAccountDirectory.newUserAccount(studentProfile5, "Pooja", "poj");
        //Student course Registration
        studentProfile4.getRegisteredCourseList().add(course3);

        Person studentPerson6 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson6.setName("Pawar");
        studentPerson6.setAge("25");
        studentPerson6.setGender("female");
        studentPerson6.setPhoneNumber("298330888");
        StudentProfile studentProfile6 = studentDirectory.newStudentProfile(studentPerson6);
        UserAccount studentAccount6 = userAccountDirectory.newUserAccount(studentProfile6, "Pawar", "paw");
        //Student course Registration
        studentProfile4.getRegisteredCourseList().add(course3);
        studentProfile4.getRegisteredCourseList().add(course4);
        studentProfile4.getRegisteredCourseList().add(course5);

        Person studentPerson7 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson7.setName("Mahima");
        studentPerson7.setAge("25");
        studentPerson7.setGender("female");
        studentPerson7.setPhoneNumber("298330888");
        StudentProfile studentProfile7 = studentDirectory.newStudentProfile(studentPerson7);
        UserAccount studentAccount7 = userAccountDirectory.newUserAccount(studentProfile7, "Mahima", "mah");
        //Student course Registration
        studentProfile7.getRegisteredCourseList().add(course3);

        Person studentPerson8 = new Person(String.valueOf(persondirectory.getPersonlist().size() + 1000));
        studentPerson8.setName("Samiksha");
        studentPerson8.setAge("25");
        studentPerson8.setGender("female");
        studentPerson8.setPhoneNumber("298330888");
        StudentProfile studentProfile8 = studentDirectory.newStudentProfile(studentPerson8);
        UserAccount studentAccount8 = userAccountDirectory.newUserAccount(studentProfile8, "Samiksha", "sam");
        //Student course Registration
        studentProfile8.getRegisteredCourseList().add(course3);

        // Returning the configured business instance
        return business;
    }
}
