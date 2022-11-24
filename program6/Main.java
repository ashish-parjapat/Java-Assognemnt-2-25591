class B{  
  void msg(){System.out.println("Hello");}  
}  


public class C{  
protected void msg(){System.out.println("Hello");}  
}  

class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
public class Main
{
	public static void main(String[] args) {
	   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
	}
}
