package BinaryTree;

import java.util.Scanner;

public class HeightOfTree {
    public static int Height(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
    	if(root.Left==null && root.Left==null) {
    		return 1;
    	}
    	
    	int left=Height(root.Left);
    	int right=Height(root.Right);
    	int res=Math.max(left, right);
    	return res+1;
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
		System.out.println(Height(root));
 
	}

}
