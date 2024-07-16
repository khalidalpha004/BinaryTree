package BinaryTree;

import java.util.Scanner;

public class SumOfNodes {
    public static int sum(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
    	int leftSum=sum(root.Left);
    	int rightSum=sum(root.Right);
    	return root.data+leftSum+rightSum;
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
		int Sum=sum(root);
		System.out.println(Sum);

	}

}
