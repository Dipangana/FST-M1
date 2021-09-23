package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		 HashSet<String> hs=new HashSet();
		 hs.add("Anushka");
		 hs.add("Deepika");
		 hs.add("Priyanka");
		 hs.add("Alia");
		 hs.add("Urvashi");
		 hs.add("Vidya");
		 
		 
		 for (String h :hs) {
			 System.out.println("People present in Set:" +h);
		 }
		 
		 System.out.println("Size of list:" +hs.size());
		 System.out.println("Removing Vidya from set:" +hs.remove("Vidya"));
		 
		 if(hs.remove("Urvi")) {
			 System.out.println("Urvi is present in set");
			 
		 }else {
			 System.out.println("Urvi not present in set");
		 }
		 
		 System.out.println("Checking if Urvashi present in set?:" +hs.contains("Urvashi"));
		 System.out.println("Updated List:" +hs);
		 
		 

	}

}
