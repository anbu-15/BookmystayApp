package room;

public class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }

    public SingleRoom(int numOfBeds, int squareFeet, double pricePerNight) {
        super(numOfBeds, squareFeet, pricePerNight);
    }
}