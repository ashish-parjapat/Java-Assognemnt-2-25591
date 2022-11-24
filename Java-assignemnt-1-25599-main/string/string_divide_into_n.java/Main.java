import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner myScanner = new Scanner(System.in);
	System.out.println("enter the value of n");
	int n = myScanner.nextInt();
	String str1="aaaaaabbbbbbcccccc";
	
	string_divide(str1,n);
	
	
	
	}
	public static void string_divide(String s,int n){
	    int length=s.length();
	    if(length%n!=0){
	        System.out.println("string canot be divide into equal parts");
	    }else{
	        System.out.println("The string divided into " + n + " parts and they are: ");
	        int subString_size=length/n;
	        for(int i=0;i<length;i++){
	             if (i % subString_size == 0) System.out.println();
    System.out.print(s.charAt(i));
	        }
	    }
	        
	}
	
	
	
}
