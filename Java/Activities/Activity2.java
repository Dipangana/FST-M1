package activities;



public class Activity2 {
	
	

	public static void main(String[] args) {
		
		int[] a;
		
		a = new int[] {10,77,10,54,-11,10};
		int sum=0;
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i] ==10) {
				
				sum= a[i]+sum;
				
				
			}
			
			
		}
		
		
		System.out.println(sum);
	
		if(sum==30) {
			System.out.println("Sum of all the 10s in array is 30");
		}
			else{
				System.out.println("Sum of all the 10s in array is greater than or less than 30");	
			}
			
		}
		


	}


