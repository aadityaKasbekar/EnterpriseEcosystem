/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.BookingManagement;

import TheBusiness.CustomerManagement.CustomerProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sakshiwadaskar
 */
public class Booking {
    private CustomerProfile guest;
    private String bookingId;
    private Map<Room, Integer> bookingRooms;
    
    private int bookingAmt;
    private String bookingSource;
    
    public Booking(String bookingId, CustomerProfile customer) {
        this.bookingId = bookingId;
        this.guest = customer;
        this.bookingRooms = new HashMap<>();
    }

    public CustomerProfile getGuest() {
        return guest;
    }

    public void setGuest(CustomerProfile guest) {
        this.guest = guest;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    
    public void addRoomBooked(Room roomBooked, int qty) {
        this.bookingRooms.put(roomBooked, bookingRooms.getOrDefault(roomBooked, 0) + qty);
    }
    
    public Map<Room, Integer> getBookingRooms() {
        return this.bookingRooms;
    }

    public int getBookingAmt() {
        int bookingAmt = 0;
        for(Room room : bookingRooms.keySet()) {
            bookingAmt += room.getRoomPrice();
        }
        return bookingAmt;
    }

    public void setBookingAmt(int bookingAmt) {
        this.bookingAmt = bookingAmt;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }
}
