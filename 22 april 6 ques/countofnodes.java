import java.util.*;

class Node{
    Node r;
    Node l;
    int data;
    
    Node(int val){
        
        r=null;
        l=null;
        data=val;
    }
}
class trees
{
        
    //count nodes in a tree
    public static int countNodes(Node root){
        if(root==null) return 0;
        return 1+countNodes(root.l)+countNodes(root.r);
    }  
        
  
    
	public static void main(String[] args) {
		Node root=new Node(1);
		root.l=new Node(2);
		root.r=new Node(4);
		root.l.l=new Node(5);
		root.l.r=new Node(7);
	    System.out.println("Total no of nodes in a tree are: "+countNodes(root));
	    
	}
}