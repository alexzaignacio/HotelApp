package hotel;

public class HouseKeeping implements HotelInterface {
    public String cleanRoom(String roomNumber) {
        return "Room " + roomNumber + " is being cleaned.";
    }
}
