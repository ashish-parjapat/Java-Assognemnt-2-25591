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
					System.out.println();
					System.out.print("Total number of nodes = ");
					System.out.print(count_nodes(head));
		
		
	}
	
	public static void printlist(node head){
	    System.out.print(head.data+"-->");
             node curr=head.next;
             while(curr!=head){
                 System.out.print(curr.data+"-->");
                 curr=curr.next;
             }
	}
	
	public static int count_nodes(node head){
	    int count=1;
	    node curr=head;
	    while(curr.next!=head){
	        curr=curr.next;
	        count++;
	    }
	    return count;
	}
	
	
}








