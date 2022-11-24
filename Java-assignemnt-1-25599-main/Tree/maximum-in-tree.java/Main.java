class node{
    int data;
    node left,right;
    node(int x){
        data=x;
        left=right=null;
    }
}
public class Main
{
	public static void main(String[] args) {
	      node root=new node(41);
	      root.left=new node(12);
	      root.left.left=new node(13);
	      root.left.left.right=new node(56);
	      root.right=new node(56);
	      root.right.left=new node(-1);
	      root.right.right=new node(6);
	      Inorder(root);
	      System.out.println();
	      System.out.print("Maximum element in tree=");
	      System.out.println(findMax(root));
	}
	
	
	
	  public static int findMax(node root)
    {
        if (root == null)
            return Integer.MIN_VALUE;
 
        int res = root.data;
        int lres = findMax(root.left);
        int rres = findMax(root.right);
 
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    
    public static void Inorder(node root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    
    
    
}
