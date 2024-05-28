import java.util.Scanner;

public class HotelWaitingRoom {

    private static final int MAX_SEATS = 10;
    private static int occupiedSeats = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the current status of the waiting room
        displayWaitingRoomStatus();

        // Check if there are available seats before allowing a customer to enter
        if (occupiedSeats < MAX_SEATS) {
            System.out.println("There are available seats. Allow a customer to enter.");
            occupiedSeats++;
        } else {
            System.out.println("The waiting room is full. Please wait for some customers to leave.");
        }

        // Display the updated status of the waiting room
        displayWaitingRoomStatus();

        scanner.close();
    }

    private static void displayWaitingRoomStatus() {
        System.out.println("Waiting Room Status:");
        System.out.println("Occupied Seats: " + occupiedSeats);
        System.out.println("Available Seats: " + (MAX_SEATS - occupiedSeats));
        System.out.println("Total Seats: " + MAX_SEATS);
        System.out.println("---------------");
    }
}
