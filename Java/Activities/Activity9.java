package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList= new ArrayList<String>();
		myList.add("Dipa");
		myList.add("Lavanya");
		myList.add("Shradha");
		myList.add("Ananya");
		myList.add("Anushka");
		
		for (String list:myList) {
			
			System.out.println("Names:" +list);
			
			
			
		}
		System.out.println("Name at 3rd index:");
		System.out.println(myList.get(2));
    System.out.println("Dipa present in list?" +myList.contains("Dipa"));
	System.out.println("Size b4 removal");
	System.out.println(myList.size());
	myList.remove(4);
	System.out.println("Size after removal");
	System.out.println(myList.size());
	
	}}
	
	



