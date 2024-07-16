package BinaryTree;

import java.util.Scanner;

public class BinaryTreeTraversals {
    public static void PreOrderPrint(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return ;
    	}
    	System.out.print(root.data+" ");
    	PreOrderPrint(root.Left);
    	PreOrderPrint(root.Right);
    }
    
    public static void InOrderPrint(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return ;
    	}
    	
    	InOrderPrint(root.Left);
    	System.out.print(root.data+" ");
    	InOrderPrint(root.Right);
    }
    
    public static void PostOrderPrint(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return ;
    	}
    	
    	PostOrderPrint(root.Left);
    	
    	PostOrderPrint(root.Right);
    	System.out.print(root.data+" ");
    }

    public static BinaryTreeNode<Integer> TakeInput(){
    	Scanner s=new Scanner(System.in);
        
    	int data=s.nextInt();
    	if(data==-1) {
    		return null;
    	}
    	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
    	System.out.println("Enter " + root.data + " left subTree data");
    	BinaryTreeNode<Integer> rootLeft=TakeInput();
    	System.out.println("Enter " + root.data + " Right subTree data");
    	BinaryTreeNode<Integer> rootRight=TakeInput();
    	root.Left=rootLeft;
    	root.Right=rootRight;
    	return root;
    	
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=TakeInput();
		PreOrderPrint(root);
		System.out.println();
		InOrderPrint(root);
		System.out.println();
		PostOrderPrint(root);
		
	}

}
