import java.util.Scanner;
public class Main
{
   public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
     
     
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();

      for (int i = 1; i <= n; i++)  	   
      { 		 		  
         int factor=0; 		  
         for(int num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		factor++;
	    }
	 }
	 if (factor==2)
	 {
	   
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
   }
}