import room.DoubleRoom;
import room.Room;
import room.SingleRoom;
import room.SuiteRoom;

/**
 * Use Case 2: Basic Room Types & Static Availability
 *
 * @author Anbu A
 */
public class BookMyStayApp {
    public static void main(String[] args) {
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        singleRoom.displayRoomDetails();
        doubleRoom.displayRoomDetails();
        suiteRoom.displayRoomDetails();
    }
}
