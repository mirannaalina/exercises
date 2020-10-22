package collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final String theatreName;

    private List<Seat> seats = new ArrayList<Seat>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastrow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastrow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }


}
