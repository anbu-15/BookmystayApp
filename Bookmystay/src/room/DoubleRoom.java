package room;

public class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }

    public DoubleRoom(int numOfBeds, int squareFeet, double pricePerNight) {
        super(numOfBeds, squareFeet, pricePerNight);
    }
}