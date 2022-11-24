

 class node{
        int data;
        node next;
        node(int x){
            data=x;
            next=null;
        }
 }
public class Main
{
   
    
    
    
    
	public static void main(String[] args) {
	node head=new node(10);
	head.next=new node(20);
	head.next.next=new node(30);
	head.next.next.next=new node(40);
	System.out.print("Number of nodes in th linked list= ");
	System.out.println(countnode(head));
	
		
	}
	
    public static int countnode(node head){
        int count=0;
        node curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
}
