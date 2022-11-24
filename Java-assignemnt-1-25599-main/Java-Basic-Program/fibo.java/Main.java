
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
   System.out.println("Enter the number upto which fibo is to be printed");
    int n = input.nextInt(); 

  
    int i=2;
   
      int prev=0,next=1;
System.out.print("0" + " "+"1"+" ");
   while(i<n){
       int sum=prev+next;
      System.out.print(sum+" ");
       prev=next;
       next=sum;
     
     
       i++;
}
}}
