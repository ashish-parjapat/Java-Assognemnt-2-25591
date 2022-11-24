 import java.util.Scanner;
 import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
	int[] arr = new int[]{12,10,-9,74,23,20,100};
	insertion_sort(arr);

}

public static void insertion_sort(int arr[]){
    int n=arr.length;
    for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    
      System.out.print("Sorted array=");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}

   
}


   

 

