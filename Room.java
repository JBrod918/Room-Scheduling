import java.util.*;

public class Room {
	String name;
	String building;
	String number;
	
	ArrayList<Reservation> events = new ArrayList<Reservation>();
	
	public Room(String name, String building, String number) {
		this.name = name;
		this.building = building;
		this.number = number;
	}
}
