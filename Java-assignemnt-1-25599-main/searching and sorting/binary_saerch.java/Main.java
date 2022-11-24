 import java.util.Scanner;
 import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
	int[] arr = new int[]{12,45,56,78,89,99,101};
	System.out.println("Enter the element to be found");
	int x=myScanner.nextInt();
	int result=binary_serach(arr,x);
	if(result>=0){
	    System.out.println("element found at index "+result);
	}else{
	    System.out.println("element not found");
	}

	
	}

	public static  int binary_serach(int arr[],int x){
	    int l=0,h=arr.length-1;
	    int mid=(l+h)/2;
	    while(h>=l){
	        mid=(l+h)/2;
	        if(arr[mid]==x){
	            return mid+1;
	        }if(arr[mid]>x){
	            h=mid-1;
	        }else{
	            l=mid+1;
	        }
	        
	    }
	    return -1;
	}
}
