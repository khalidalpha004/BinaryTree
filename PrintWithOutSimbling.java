package BinaryTree;

import java.util.Scanner;

public class PrintWithOutSimbling {
    public static void PrintNode(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	if(root.Left!=null && root.Right==null) {
    		System.out.print(root.Left.data +" ");
    	}
    	if(root.Right!=null && root.Left==null) {
    		System.out.print(root.Right.data +" ");
    	}
    	PrintNode(root.Left);
    	PrintNode(root.Right);
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
		PrintNode(root);
		

	}

}
