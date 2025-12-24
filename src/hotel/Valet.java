package hotel;

public class Valet implements HotelInterface {
    public String pickUpVehicle(String plateNumber) {
        return "Vehicle with plate number " + plateNumber + " is being picked up.";
    }
}
