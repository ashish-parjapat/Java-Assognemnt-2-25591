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
				// 	new_node_at_middle(head,15);
					System.out.println();
					if(search(head,0)){
					    System.out.println("Element found in linked list");
					}else{
					    System.out.println("Not found in linked list");
					}
				// 	System.out.print("New linked list = ");
				// 	printlist(head);
			
					
	}
	
	public static void printlist(node head){
	    System.out.print(head.data+"-->");
             node curr=head.next;
             while(curr!=head){
                 System.out.print(curr.data+"-->");
                 curr=curr.next;
             }
	}
public static boolean search(node head,int item){
    node curr=head;
   do{
       if(curr.data==item){
           return true;
       }
       curr=curr.next;
   }while(curr!=head);
   return false;
}
	
 
	
	
}









