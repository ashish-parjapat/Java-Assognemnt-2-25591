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
					System.out.print("Maximum node value:");
				System.out.print(maximum_circular(head));
					
					
	}
	
	public static void printlist(node head){
	    System.out.print(head.data+"-->");
             node curr=head.next;
             while(curr!=head){
                 System.out.print(curr.data+"-->");
                 curr=curr.next;
             }
	}
public static int maximum_circular(node head){
    int maximum=Integer.MIN_VALUE;
    node curr=head;
    do{
        if(maximum<curr.data){
            maximum=curr.data;
        }
        curr=curr.next;
    }while(curr!=head);
    return maximum;
}
	
 
	
	
}









