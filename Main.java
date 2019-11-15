package org.coderstone.RoomScheduling;

import static spark.Spark.*;
import java.io.*;
import java.util.*;

public class Main
{
	public static Room[] rooms=new Room[99];
	public static String bigBoi;
	public static Scanner s;
	
	public static void main(String[]args)
	{
		try
		{
			
			s = new Scanner(new File("src/resources/rooms.txt"));
			for (int i=0;i<99;i++) {
				bigBoi=s.nextLine();
				String[] stuff=bigBoi.split(", ");
				rooms[i]=new Room(stuff[0],stuff[1],stuff[2]);
			}
			s.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rooms[0].newRes(6, 10, 6, 0, "ESSO", "John");	
		rooms[0].newRes(7, 9, 6, 0, "Exonian", "Lisa");
		System.out.println(rooms[0].events.get(0));
	}
	
	public String printAllRes() {
		String text = "";
		for(int i = 0; i < rooms.length; i++) {
			for(int j = 0; j < rooms[i].events.size(); j++) {
				text += rooms[i].events.get(j);
			}
		}
		return text;
	}
}
