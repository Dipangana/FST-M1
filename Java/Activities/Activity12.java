package activities;



public class Activity12 {

	public static void main(String[] args) {
		
		Addable ad1 = (s , u) ->(s+u);
		Addable ad2 = (int t ,int v) ->{ return (t+v);
		
		};
		
		System.out.println(ad2.add(1000,2000));
	}
	
	

}


interface Addable {
	int add(int num1 ,int num2) ;
		
	
}