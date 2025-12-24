package hotel;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.housekeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public String requestValet(String plateNumber) {
        return valet.pickUpVehicle(plateNumber);
    }

    public String requestCleaning(String roomNumber) {
        return housekeeping.cleanRoom(roomNumber);
    }

    public String requestCart(int numberOfCarts) {
        return cart.requestCart(numberOfCarts);
    }
}
