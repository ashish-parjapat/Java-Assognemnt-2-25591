import java.util.*;
import java.io.*;
import java.lang.*;

 class node{
        char data;
        node next;
        node(char x){
            data=x;
            next=null;
        }
 }
public class Main
{
   
	public static void main(String[] args) {
	node head=new node('a');
	head.next=new node('b');
	head.next.next=new node('a');
	head.next.next.next=new node('b');
if(palindrome(head)){
    System.out.println("yes");
}else{
    System.out.println("No");
}
		
	}
	static boolean palindrome(node head){
Deque<Character> stack=new ArrayDeque<Character>();
	     for(node curr=head;curr!=null;curr=curr.next)
            stack.push(curr.data);
	     for(node curr=head;curr!=null;curr=curr.next){
	        if(stack.pop()!=curr.data){
	            return false;
	        }
	    }
	    return true;
	    
	}
	
	

   
}

