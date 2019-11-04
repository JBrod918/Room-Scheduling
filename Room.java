import java.util.*;

public class Room {
	String name;
	String building;
	String number;
	
	Time[][] times = new Time[30][96];
	
	ArrayList<Reservation> events = new ArrayList<Reservation>();
	
	public Room(String name, String building, String number) {
		this.name = name;
		this.building = building;
		this.number = number;
	}
	
	boolean checkFree(int start, int end, int day) {
		for(int i = start; i < end; i++) {
			if(times[day][i].status == 2) return false;
		}
		return true;
	}
}
