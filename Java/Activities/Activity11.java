package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer,String> colours=new HashMap<Integer,String>(); 
		colours.put(1, "Pink");
		colours.put(2, "Red");
		colours.put(3, "Yellow");
		colours.put(4, "Blue");
		colours.put(5, "Violet");
		
		System.out.println("Colours present in Map:" +colours);
		colours.remove(1,"Pink");
		System.out.println("Colours present in Map after removing Pink:" +colours);
		if (colours.containsValue("Green")) {
			System.out.println("Green Colour is present in Map");
		} else {
			System.out.println("Green Colour is not present in Map");
		}
		System.out.println("Size of Map:" +colours.size());
		
		
		

	}

}
