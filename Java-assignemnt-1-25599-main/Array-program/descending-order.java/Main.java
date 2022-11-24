// Java program to sort the elements in descending order 
import java.util.*; 

class Main { 
	public static void main(String[] args) 
	{ 

	
		Integer array[] = { 1, 2, 3, 4, 5 }; 

		
		Arrays.sort(array, Collections.reverseOrder()); 

		System.out.println(Arrays.toString(array)); 
	} 
}
