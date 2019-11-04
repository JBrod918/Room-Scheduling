
import java.time.LocalDateTime;


public class Reservation {
	int start;
	int end;
	int starth;
	int endh;
	int startm;
	int endm;
	String name;
	String reserver;
	LocalDateTime day;
	/* 0 - midnight
	 * 1 - 00:15
	 * etc.
	 */
    public Reservation(int s, int e, int d, String n, String w) {
    	start=s;
    	end=e;
    	starth=s/4;
    	endh=e/4;
    	startm=(s%4)*15;
    	endh=(e%4)*15;
    	day=LocalDateTime.now();
    	day=day.plusDays(d);
    	day=day.withHour(starth);
    	day=day.withMinute(startm);
    	name=n;
    	reserver=w;
    }
    public String toString() {
    	return name+" by "+reserver+" at "+day+"-"+endh+":"+endm;
    }
    
}
