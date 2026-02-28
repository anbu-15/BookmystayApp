package room;

public class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 750, 5000);
    }

    public SuiteRoom(int numOfBeds, int squareFeet, double pricePerNight) {
        super(numOfBeds, squareFeet, pricePerNight);
    }
}