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
					head.next.next.next.next=head;
					System.out.print("Original linked list: ");
					printlist(head);
					head=new_node_at_beginning(head,5);
					System.out.println();
					System.out.print("New linked list = ");
					printlist(head);
			
					
	}
	
	public static void printlist(node head){
	    System.out.print(head.data+"-->");
             node curr=head.next;
             while(curr!=head){
                 System.out.print(curr.data+"-->");
                 curr=curr.next;
             }
	}
public static node new_node_at_beginning(node head,int value){
    node new_head=new node(value);
    node curr=head;
    while(curr.next!=head){
        curr=curr.next;
    }
    curr.next=new_head;
    new_head.next=head;
    return new_head;
}
	
 
	
	
}









