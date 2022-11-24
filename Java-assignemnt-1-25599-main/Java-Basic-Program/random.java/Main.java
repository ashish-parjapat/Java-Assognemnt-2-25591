import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Random ran=new Random();
		int random_number=ran.nextInt(50);
		System.out.print("Your generated random number is: ");
		System.out.println(random_number);
		
	}
}
