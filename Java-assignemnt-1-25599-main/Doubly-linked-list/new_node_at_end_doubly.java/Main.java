class node{
    int data;
    node next;
    node prev;
    node(int x){
        data=x;
        next=null;
        prev=null;
        
    }
}

public class Main
{
	public static void main(String[] args) {
	node head=new node(10);
node temp1=new node(20);
node temp2=new node(250);
node temp3=new node(30);
head.next=temp1;
head.prev=null;
temp1.next=temp2;
temp1.prev=head;
temp2.next=temp3;
temp2.prev=temp1;
temp3.next=null;
temp3.prev=temp2;

	System.out.print("Original doubly linked list: ");
	printlist(head);
	System.out.println();
	node_at_end(head,5);
System.out.print("New linked list: ");
printlist(head);
	
	}
	
	public static void printlist(node head){
	    node curr=head;
	    while(curr!=null){
	        System.out.print(curr.data+"-->");
	        curr=curr.next;
	    }
	}
	public static void node_at_end(node head,int value){
	    node tail=new node(value);
	   node curr=head;
	   while(curr.next!=null){
	       curr=curr.next;
	   }
	   curr.next=tail;
	   tail.prev=curr;
	    
	}
  
	
	
	
	
	
	
	
	
	
}
