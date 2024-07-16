package BinaryTree;

import java.util.Scanner;

public class PrintAtDepthK {
    public static void PrintkDepthElement(BinaryTreeNode<Integer> root,int k) {
    	if(root==null) {
    		return;
    	}
    	if(k==0) {
    		System.out.print(root.data +" ");
    		return;
    	}
    	PrintkDepthElement(root.Left,k-1);
    	PrintkDepthElement(root.Right,k-1);
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
		// TODO Auto-generated method 
		BinaryTreeNode<Integer> root=TakeInput();
		PrintkDepthElement(root,1);

	}

}
