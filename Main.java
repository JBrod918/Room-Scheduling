import static spark.Spark.*;
import java.io.*;
import java.util.*;

import java.time.LocalDateTime;


public class Main{
	public static void main (String[]args) {
		Room[] rooms=new Room[99];
		String bigBoi;
		Scanner s=new Scanner(new File("poem1.txt"));
		for (int i=0;i<rooms.length;i++) {
			bigBoi=s.nextLine();
			String[] stuff=bigBoi.split(", ");
			rooms[i]=new Room(stuff[0],stuff[1],stuff[2]);
		}
	}
}