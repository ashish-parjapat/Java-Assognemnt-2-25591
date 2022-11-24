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
					delete_node_middle(head);
					System.out.println();
					System.out.print("new linked list: ");
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
	public static void delete_node_middle(node head){
	    node curr=head;
	    curr.next=curr.next.next;
	   
	    
	    
	    
	}
	
 
	
	
}









