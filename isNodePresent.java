package BinaryTree;

import java.util.Scanner;

public class isNodePresent {
    public static boolean isNode(BinaryTreeNode<Integer> root,int x) {
    	if(root==null) {
    		return false;
    	}
    	else if(root.data==x) {
    		return true;
    	}else {
    	return (isNode(root.Left,x)|| isNode(root.Right,x));
    	}
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
		System.out.println(isNode(root,6));
		

	}

}
