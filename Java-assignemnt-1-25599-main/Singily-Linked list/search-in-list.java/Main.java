import java.util.*;
import java.io.*;
import java.lang.*;

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
	node head=new node(1);
	head.next=new node(10);
	head.next.next=new node(45);
	head.next.next.next=new node(65);
	printlist(head);
if(search(head,5)){
    System.out.println("yes,element is present in list");
}else{
    System.out.println("No, element doesnot prsent inlist");
}
		
	}
public static boolean search(node head,int searched_item){
    node curr=head;
    while(curr!=null){
        if(curr.data==searched_item){
            return true;
        }
        curr=curr.next;
        
    }
    return false;
}

static void printlist(node head){
    node curr=head;
    while(curr!=null){
        System.out.print(curr.data+"-->");
        curr=curr.next;
    }
    System.out.println();
}

   
}


