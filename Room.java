package org.coderstone.RoomScheduling;
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
		
		for(int i = 0; i < 30; i++) {
			for(int j = 0; j < 96; j++) {
				times[i][j] = new Time();
			}
		}
	}
	
	boolean checkFree(int start, int end, int day) {
		//returns true if a reservation between the start and end points on the given day is completely free
		for(int i = start; i < end; i++) {
			if(times[day][i].status == 2) return false;
		}
		return true;
	}
	
	boolean newRes(int start, int end, int day, int repeating, String name, String reserver) {
		if(repeating == 0 && checkFree(start, end, day)) {
			events.add(new Reservation(start, end, day, repeating, name, reserver));
			for(int i = start; i <= end; i++) times[day][i].status = 2;
		}
		else {
			for(int i = 0; i < 30; i += repeating) if(!checkFree(start, end, day+i)) return false;
			for(int i = 0; i < 30; i += repeating) {
				events.add(new Reservation(start, end, day+i, repeating, name, reserver));
				for(int j = start; j <= end; j++) times[day+i][j].status = 2;
			}
		}
		return true;
	}
}
