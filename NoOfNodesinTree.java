package BinaryTree;

import java.util.Scanner;

public class NoOfNodesinTree {
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
    public static int NoOfNodes(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
    	int left=NoOfNodes(root.Left);
    	int right=NoOfNodes(root.Right);
    	return left+right+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=TakeInput();
		int nodes=NoOfNodes(root);
		System.out.println(nodes);
	}

}
