package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) {
		File f = new File("src/activities/input.txt");
		try {
			boolean cfile = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		File fileUtil = FileUtils.getFile("src/activities/input.txt");
		try {
			System.out.println("Data in file:" +FileUtils.readFileToString(fileUtil, "UTF8"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		File dir = new File ("resources");
		try {
			FileUtils.copyFileToDirectory(f,dir);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
		File newF = FileUtils.getFile(dir,"input.txt"); 
		try {
			String newfd = FileUtils.readFileToString(newF, "UTF8");
			System.out.println("Data in file " +newfd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
