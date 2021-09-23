package activities;

public class Activity7 {

	public static void main(String[] args) {
		
		MountainBike mb= new MountainBike(9,0,12);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(50);
		mb.applyBrake(3);
		

	}
	
	
	

}

  interface BicycleParts {
	  public int gears = 0;
	  public int speed = 0;
	
}
  
  interface BicycleOperations {
	  public void applyBrake(int decrement);
	  public void speedUp(int increment);
	
}
  
  class Bicycle implements BicycleParts , BicycleOperations {
	  public int gears;
	  public int currentSpeed;
	  public Bicycle(int g, int s) {
		  this.gears =g;
		  this.currentSpeed=s;
	  }
	  
	  public void applyBrake(int decrement) {
		  currentSpeed -= decrement;
		  System.out.println(currentSpeed);
		  
	  }
	  public void speedUp(int increment) {
		  currentSpeed += increment;
		  System.out.println(currentSpeed);
	  }
	  
	  public String bicycleDesc() {
		  return("Gears: " +gears+ "speed: " +currentSpeed);
		
		  
	  }

	

	
  }
  
  class MountainBike extends Bicycle {
	  public int seatHeight;
	  public MountainBike(int g, int s,int startHeight) {
		super(g, s);
		seatHeight = startHeight;
		
		
	}


  
  
  public void seatHeight(int v) {
	  seatHeight =v;
  }
  public String bicycleDesc() {
	  return (super.bicycleDesc()+ "seatheight:"  +seatHeight);
  }
  
  
  }
  
  

  
  
    
  
