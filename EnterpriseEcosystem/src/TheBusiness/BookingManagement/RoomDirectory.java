/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.BookingManagement;

import TheBusiness.Business.Business;
import TheBusiness.ProductManagement.Product;
import java.util.ArrayList;

/**
 *
 * @author sakshiwadaskar
 */
public class RoomDirectory {

    Business business;

    ArrayList<Room> roomList;

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public RoomDirectory(Business b) {

        roomList = new ArrayList();
    }

    public Room addRoom(Room r) {

        roomList.add(r);
        return r;
    }

    public void deleteProduct(Product p) {
        this.roomList.remove(p);
    }

    public Room findRoom(String id) {
        for (Room room : roomList) {
            if (room.getRoomId().equals(id)) {
                return room;
            }
        }
        return null;
    }
}
