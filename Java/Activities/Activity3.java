package activities;

public class Activity3 {

	public static void main(String[] args) {
	double myage = 1000000000;
	
	double ageEarth = 31557600;
	double ageMars = 31557600*1.8808158;
	double ageMercury = 31557600*0.2408467;
	double ageVenus = 31557600*0.61519726;
	double ageJupiter =31557600*11.862615;
	double ageNeptune = 31557600*164.79132;
	double ageSaturn =31557600*29.447498;
	double ageUranus = 31557600*84.016846;
	
	System.out.println("ageonEarth:" + Math.round(myage/ageEarth) +"years");
	System.out.println("ageonMars:" + Math.round(myage/ageMars) +"years");
	System.out.println("ageonMercury:" + Math.round(myage/ageMercury) +"years");
	System.out.println("ageonVenus:" + Math.round(myage/ageVenus) +"years");
	System.out.println("ageonJupiter:" + Math.round( myage/ageJupiter) +"years");
	System.out.println("ageonNeptune:" + (myage/ageNeptune) +"years");
	System.out.println("ageonSaturn:" + Math.round(myage/ageSaturn) +"years");
	System.out.println("ageonUranus:" + (myage/ageUranus)+"years");
	
	
		
		

	}
	
	

}
