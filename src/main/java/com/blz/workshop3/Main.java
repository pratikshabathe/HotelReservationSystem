package com.blz.workshop3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
	System.out.println("--Welcome to Hotel Reservation System Program--");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<String>();
		
			al.add("Lackwood");
			al.add("Bridgewood");
			al.add("ridgewood");
			
			Iterator itr = al.iterator();
			while(itr.hasNext()) {
			System.out.println(itr.next());
			}
		
	}
}
	
	
