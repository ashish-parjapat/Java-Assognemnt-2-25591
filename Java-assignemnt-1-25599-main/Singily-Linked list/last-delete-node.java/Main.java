

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
  System.out.println();
  System.out.print("last node remove linked list: ");
  head=deletelast(head);

		
	}
	static node deletelast(node head){
	    if(head.next==null)return null;
	    else{
	        node curr=head;
	        while(curr.next!=null){
	            System.out.print(curr.data+"-->");
	            curr=curr.next;
	        }
	    }
	    return head;
	}
	
	public static void printlist(node head){
	    node curr=head;
	    while(curr!=null){
	        System.out.print(curr.data+"-->");
	        curr=curr.next;
	    }
	    
	}

   
}

