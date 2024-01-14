package TheBusiness.BookingManagement;

/**
 * The Room class represents a hotel room with essential information such as room ID, type, price, and availability.
 * It is part of the Booking Management system.
 * 
 * @author sakshiwadaskar
 */
public class Room {

    /**
     * The unique identifier for the room.
     */
    private String roomId;

    /**
     * The type or category of the room.
     */
    private String roomType;

    /**
     * The price associated with the room.
     */
    private int roomPrice;

    /**
     * The availability status of the room.
     */
    private int availability;

    /**
     * Constructs a new Room object with the specified parameters.
     * 
     * @param roomId The unique identifier for the room.
     * @param roomType The type or category of the room.
     * @param roomPrice The price associated with the room.
     * @param availability The availability status of the room.
     */
    public Room(String roomId, String roomType, int roomPrice, int availability) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.availability = availability;
    }

    /**
     * Gets the availability status of the room.
     * 
     * @return The availability status of the room.
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * Sets the availability status of the room.
     * 
     * @param availability The new availability status of the room.
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * Gets the unique identifier for the room.
     * 
     * @return The room ID.
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Gets the price associated with the room.
     * 
     * @return The room price.
     */
    public int getRoomPrice() {
        return this.roomPrice;
    }

    /**
     * Gets the type or category of the room.
     * 
     * @return The room type.
     */
    public String getRoomType() {
        return roomType;
    }
}