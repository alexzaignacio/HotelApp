package hotel;

public class Cart implements HotelInterface {
    public String requestCart(int numberOfCarts) {
        return numberOfCarts + " luggage cart(s) have been requested.";
    }
}
