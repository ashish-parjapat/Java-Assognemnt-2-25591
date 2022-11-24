class Bike1{  
//creating a default constructor  
Bike1(){System.out.println("Bike is created");} 

class Student3{  
int id;  
String name;  
//method to display the value of id and name  
void display(){System.out.println(id+" "+name);} 

class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}

public class Main
{
	public static void main(String[] args) {
		Bike1 b=new Bike1();  
		Student3 s1=new Student3();  
Student3 s2=new Student3();  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan");  

	}
}
