package hotel;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Request valet service
        System.out.println(frontDesk.requestValet("ABC123"));

        // Request room cleaning
        System.out.println(frontDesk.requestCleaning("101"));

        // Request luggage carts
        System.out.println(frontDesk.requestCart(2));
    }
}
