
public class Main
{
    static class node{
        int data;
        node next;
        node(int x){
            data=x;
            next=null;
        }
    }
    
    
    
    
	public static void main(String[] args) {
	 node head=new node(10);
	  node temp1=new node(20);
	  node temp2=new node(50);
	  node temp3=new node(40);
	  head.next=temp1;
	  temp1.next=temp2;
	  temp2.next=temp3;
	  
	}
}
