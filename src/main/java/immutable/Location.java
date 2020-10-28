package immutable;

import java.util.HashMap;
import java.util.Map;

public class Location {

    //variables should be private and final in order to have an immutable class

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;
        this.exits.put("Q",0);

    }

    public int getExits(Map<String,Integer> exits) {
        return locationID;
    }

    public String getDescription() {
        return description;
    }
}
