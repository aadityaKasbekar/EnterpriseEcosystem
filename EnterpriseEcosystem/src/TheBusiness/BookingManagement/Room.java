/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.BookingManagement;

/**
 *
 * @author sakshiwadaskar
 */
public class Room {

    private String roomId;
    private String roomType;
    private int roomPrice;
    private int availability;

    public Room(String roomId, String roomType, int roomPrice, int availability) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.availability = availability;
        
    }

    public int getAvailability() {
        return availability;
    }
    
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getRoomPrice() {
        return this.roomPrice;
    }
   
    public String getRoomType() {
        return roomType;
    }
}
