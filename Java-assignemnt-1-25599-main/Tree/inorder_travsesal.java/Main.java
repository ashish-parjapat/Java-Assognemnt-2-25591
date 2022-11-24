class node{
    int data;
    node left;
    node right;
    node(int x){
        data=x;
        left=null;
        right=null;
    }
}


public class Main
{
    
    
	public static void main(String[] args) {
	node root=new node(20);
	root.left=new node(10);
	root.left.left=new node(8);
	root.left.right=new node(9);
	root.right=new node(30);
	root.right.left=new node(25);
	root.right.right=new node(26);
	System.out.print("InorderTraversal of tree =");
inorder_traversal(root);
	}
	
	
public static void inorder_traversal(node root){
    if(root!=null){
        inorder_traversal(root.left);
        System.out.print(root.data+" ");
        inorder_traversal(root.right);
    }
}	




	
	
}


