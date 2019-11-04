public class Time{
	int status=0;
	String name="";
	String reserver="";
	public Time() {
		
	}
	public void setStat(int s) {
		status=s;
	}
	public int getStat() {
		return status;
	}
	public void newStuff(String n, String r) {
		name=n;
		reserver=r;
	}
}