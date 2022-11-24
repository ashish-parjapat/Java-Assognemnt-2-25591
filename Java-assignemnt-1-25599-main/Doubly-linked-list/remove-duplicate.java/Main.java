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
node temp1=new node(10);
node temp2=new node(25);
node temp3=new node(25);
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
	remove_duplicate(head);
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
	public static void remove_duplicate(node head){
	    node curr=head;
	    while(curr!=null&&curr.next!=null){
	        if(curr.data==curr.next.data){
	            curr.next=curr.next.next;
	        }
	        curr=curr.next;
	    }
	}
  
	
	
	
	
	
	
	
	
	
}
