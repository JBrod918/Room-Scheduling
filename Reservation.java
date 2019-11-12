package org.coderstone.RoomScheduling;
import java.time.LocalDateTime;


public class Reservation {
	private int repeating;
	private String name;
	private String reserver;
	private LocalDateTime sday;
	private LocalDateTime eday;
	/* 0 - midnight
	 * 1 - 00:15
	 * etc.
	 */
	//za warudo
    public Reservation(int s, int e, int d, int r, String n, String w) {
    	sday=LocalDateTime.now();
    	sday=sday.plusDays(d);
    	sday=sday.withHour(s/4);
    	sday=sday.withMinute((s%4)*15);
    	sday=sday.withSecond(0).withNano(0);
    	eday=sday;
    	eday=eday.withHour(e/4);
    	eday=eday.withMinute((e%4)*15);
    	name=n;
    	reserver=w;
    	repeating = r;
    }
    public String toString() {
    	return name+" reserved by "+reserver+" from "+sday+" until "+eday;
    }
    
    public int getRepeating() {return repeating;}
    public LocalDateTime getSDay() {
    	return sday;
    }
    public LocalDateTime getEDay() {
    	return eday;
    }
    public String getName() {return name;}
    public String getReserver() {return reserver;}
}
