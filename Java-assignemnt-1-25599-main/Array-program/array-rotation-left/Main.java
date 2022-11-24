import java.util.Scanner;
import java.util.Arrays; 
public class Main
{
    
    static void leftRotate(int arr[],int d,int n){
        reverse(arr,0,d-1);
            reverse(arr,d,n-1);
                reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int low,int high){
        	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;

    		low++;
    		high--;
    	}
        
    }
    
    
    
    
    
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5,6,7};
	int n=arr.length;
		for (int i =0;i<arr.length ;i++ ){
	    System.out.print(arr[i]+" ");
	}
	System.out.println();
	Scanner input=new Scanner(System.in);
	System.out.print("Ente the value of how much you want to left rotate the array:");
	int d=input.nextInt();


	 leftRotate(arr, d, n);

       System.out.print("After Rotation array=");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

	    
	
	
	}
}
