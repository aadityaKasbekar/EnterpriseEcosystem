/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.BookingManagement;

import TheBusiness.Business.Business;
import java.util.ArrayList;

/**
 *
 * @author sakshiwadaskar
 */
public class BookingDirectory {

    Business business;
    ArrayList<Booking> bookingList;

    public BookingDirectory(Business b) {
        this.business = b;
        bookingList = new ArrayList();

    }

    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }

    public Booking addBooking(Booking b) {

        bookingList.add(b);
        return b;
    }

    public void deleteBooking(Booking b) {
        this.bookingList.remove(b);
    }
}
