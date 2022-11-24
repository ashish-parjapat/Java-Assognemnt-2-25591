

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
	System.out.print("original linked list: ");
   printlist(head);
   System.out.print();
   System.out.println("revsre linked list: ");
   head=reverseList(head);
printlist(head);
		
	}
	 static node reverseList(node head){
	    node curr=head;
	    node prev=null;
	    while(curr!=null){
	        node next=curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=next;
	        
	    }
	    return prev;
	}
	public static void printlist(node head){
	    node curr=head;
	    while(curr!=null){
	        System.out.print(curr.data+"-->");
	        curr=curr.next;
	    }
	    
	}

   
}
