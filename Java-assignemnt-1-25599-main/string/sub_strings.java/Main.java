import java.util.*;

public class Main
{
	public static void main(String[] args) {
	String s="FUN";
	Sub_strings(s);
	}
	
	public static void Sub_strings(String s){
	    int length=s.length();
	    int index=0;
	       String arr[] = new String[length*(length+1)/2];  
	       for(int i=0;i<length;i++){
	           for(int j=0;j<length;j++){
	                 arr[index] = s.substring(i, j+1);  
                index++;  
	           }
	               
	       }
	       System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
	}
}
