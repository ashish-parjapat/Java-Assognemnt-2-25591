import java.util.Arrays;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
	int arr[]={9,8,7,6,5,4,3,2,1};
	System.out.print("Original Arraay: ");
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+" ");
	}
	System.out.println();
	Arrays.sort(arr);
	System.out.print("Sorted Array= ");
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+" ");
	}
	
	
	
	}
	
}
