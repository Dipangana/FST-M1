package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
		Plane p = new Plane(10);
		
		p.onboard("Dipangana");
		p.onboard("Trisha");
		p.onboard("Akshita");
		p.onboard("Asmita");
		p.onboard("Payel");
		
		System.out.println("Takeoff Time:"+ p.takeOff());
		System.out.println("Passengers " +p.getPassengers());
		Thread.sleep(5000);
		p.landed();
		System.out.println("LandTime:" +p.getLastTimeLanded());
		
	}
	
	

}
			class Plane{
		
		private int maxPassengers;
		private ArrayList passengers;
		private Date takeoff;
		private Date landed;

		public Plane(int maxPassengers) {
			this.maxPassengers = maxPassengers;
			this.passengers = new ArrayList<> ();
			
			
			
		}
		public void onboard(String passenger) {
			this.passengers.add(passenger);
		}
		public Date takeOff() {
			return this.takeoff = new Date();
			
		}
		public void landed() {
			this.landed = new Date();
		}
		
		public Date getLastTimeLanded() {
			return landed;
		}
		public List<String> getPassengers() {
			return passengers;
			}
	}