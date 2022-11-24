import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int[] array = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
	    int [] copyArray=new int[10];
	    for(int i=0;i<array.length;i++){
	        copyArray[i]=array[i];
	    }
	    System.out.print("Copy Array Elements= ");
	    for(int i=0;i<copyArray.length;i++){
	        System.out.print(copyArray[i]+" ");
	    }
		
	}
}
