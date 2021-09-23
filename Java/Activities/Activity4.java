package activities;

public class Activity4 {
	
       public static void main(String[] args){    
        int[] arr = {10,121,99,60,47,13,98,222,111,2};    
        System.out.println("Before Insertion Sort");    
        for(int a:arr){    
            System.out.print(a+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr);    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr){    
            System.out.print(i+" ");    
        }    
    } 
    public static void insertionSort(int array[]) {  
        int a1 = array.length;  
        for (int j = 1; j < a1; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
}    


