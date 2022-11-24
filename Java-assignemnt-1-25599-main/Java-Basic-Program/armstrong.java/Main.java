import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number to be checked if Armstrong:");
        int n = sc.nextInt();
          int sum=0;
    int k=n;
    while(k!=0){
        int lastdigit=k%10;
        sum=sum+lastdigit*lastdigit*lastdigit;
        k=k/10;
        
    }
    if(sum==n){
        System.out.println("Yes Armstrong Number");
    }else{
         System.out.println("No,not a armstorng Number");
    }

	}
}
