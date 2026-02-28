package room;

public class Room {
    protected int numOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numOfBeds, int squareFeet, double pricePerNight) {
        this.numOfBeds = numOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("RoomDetails : " +
                "\n Number of Beds : " + this.numOfBeds +
                "\n Square Feet : " + this.squareFeet +
                "\n Price per Night : " + this.pricePerNight
        );
    }
}
