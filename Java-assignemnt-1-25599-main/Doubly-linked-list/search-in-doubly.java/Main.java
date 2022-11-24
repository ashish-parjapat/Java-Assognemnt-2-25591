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
node temp1=new node(7);
node temp2=new node(12);
node temp3=new node(23);
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
	if(search(head,12)){
	    System.out.println("Element found");
	}else{
	    System.out.println("Not found");
	}
	}
	
	
public static void printlist(node head){
	    node curr=head;
	    while(curr!=null){
	        System.out.print(curr.data+"-->");
	        curr=curr.next;
	    }
	}
public static boolean search(node head,int item){
    node curr=head;
    while(curr!=null){
        if(curr.data==item){
            return true;
        }
        curr=curr.next;
    }
    return false;
}
	
}
