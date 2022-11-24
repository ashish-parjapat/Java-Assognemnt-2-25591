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
	node head=new node(50);
	head.next=new node(100);
	head.next.next=new node(40);
	head.next.next.next=new node(51);
printlist(head);
	System.out.println();
	System.out.print("Maximum node in above linked list is:");
	System.out.println(maximum(head));
	

   
}

public static int maximum(node head){
    node curr=head;
    int maximum_node=curr.data;
    while(curr!=null){
        if(curr.data>maximum_node){
            maximum_node=curr.data;
        }
        curr=curr.next;
    }
    return maximum_node;
}

public static void printlist(node head){
    node curr=head;
    while(curr!=null){
        System.out.print(curr.data+"-->");
        curr=curr.next;
    }
}

}









