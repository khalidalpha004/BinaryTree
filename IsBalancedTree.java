package BinaryTree;

import java.util.Scanner;

public class IsBalancedTree {
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int height=0;
			boolean isbal=true;
			BalancedTreeReturn ans= new BalancedTreeReturn();
			ans.Height=height;
			ans.isBalanced=isbal;
			return ans;
		}
		BalancedTreeReturn leftOutput=isBalancedBetter(root.Left);
		BalancedTreeReturn rightOutput=isBalancedBetter(root.Right);
		boolean isBal=true;
		int height=1+Math.max(leftOutput.Height,rightOutput.Height);
		if(Math.abs(leftOutput.Height-rightOutput.Height)>1) {
			isBal=false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
			isBal=false;
		}
		
		BalancedTreeReturn ans= new BalancedTreeReturn();
		ans.Height=height;
		ans.isBalanced=isBal;
		return ans;
	}
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return true;
    	}
    	int leftHeight=Height(root.Left);
    	int rightHeight=Height(root.Right);
    	if(Math.abs(rightHeight-leftHeight)>1) {
    		return false;
    	}
    	boolean isLeftBalanced=isBalanced(root.Left);
    	boolean isRightBalanced=isBalanced(root.Right);
    	return isLeftBalanced && isRightBalanced;
    }
    
    public static int Height(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
    	int left=Height(root.Left);
    	int right=Height(root.Right);
    	return Math.max(left, right) + 1;
    	
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
		System.out.println(isBalancedBetter(root).isBalanced);

	}

}
