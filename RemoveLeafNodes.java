package BinaryTree;

import java.util.Scanner;

public class RemoveLeafNodes {
    public static BinaryTreeNode<Integer> RemoveLeaf(BinaryTreeNode<Integer> root){
    	if(root==null) {
    		return null;
    	}
    	if(root.Left==null && root.Right==null) {
    		return null;
    	}
    	root.Left=RemoveLeaf(root.Left);
    	root.Right=RemoveLeaf(root.Right);
    	return root;
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

	}

}
