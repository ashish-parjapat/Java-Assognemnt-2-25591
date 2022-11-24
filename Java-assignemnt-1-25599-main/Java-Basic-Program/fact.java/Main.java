import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number whose fact to be found");
	int n = input.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++){
	    fact*=i;
	}
System.out.println(fact);
	
		
	}
}
