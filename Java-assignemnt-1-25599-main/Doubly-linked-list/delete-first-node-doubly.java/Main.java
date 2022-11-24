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
node temp2=new node(25);
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
	head=delete_node(head);
	System.out.print("New Linked list after deletion :");
	printlist(head);
	
	
	}
	
	public static void printlist(node head){
	    node curr=head;
	    while(curr!=null){
	        System.out.print(curr.data+"-->");
	        curr=curr.next;
	    }
	}
	public static node delete_node(node head){
	    node new_head=head.next;
	    head.next.prev=null;
	    return new_head;
	}
	
	
	
	
	
	
	
	
	
}
