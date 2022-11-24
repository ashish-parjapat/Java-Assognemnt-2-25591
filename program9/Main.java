public class GFG {
 
    // First addition function
    public static int add(int a, int b)
    {
        return a + b;
    }
 
    // Second addition function
    public static double add(
        double a, double b)
    {
        return a + b;
    }
    
    
    
    class Test {
 
    // Implementing a method
    public void method()
    {
        System.out.println("Method 1");
    }
}
 public class GFG extends Test {
 
    // Overriding the parent method
    public void method()
    {
        System.out.println("Method 2");
    }
public class Main
{
	public static void main(String[] args) {
	  System.out.println(add(2, 3));
 
        // Here, the second addition
        // function is called
        System.out.println(add(2.0, 3.0));
        Test test = new GFG();
 
        test.method();
	}
}
