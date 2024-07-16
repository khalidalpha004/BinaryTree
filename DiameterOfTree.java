package BinaryTree;

import java.util.Scanner;

public class DiameterOfTree {
    public static int Diameter(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return 0;
    	}
//    	int leftHeight=Height(root.Left);
//    	int rightHeight=Height(root.Right);
//    	return leftHeight+rightHeight+1;
    	
    	int option1 = Height(root.Left) +Height(root.Right); // Option 1
    	int option2 = Diameter(root.Left); // Option 2
    	int option3 = Diameter(root.Right); // Option 3
    	return Math.max(option1, Math.max(option2, option3));
    }
	

	public static int Height(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		int leftHeight=Height(root.Left);
    	int rightHeight=Height(root.Right);
    	if(leftHeight>rightHeight) {
    		return leftHeight+1;
    	}
		return rightHeight+1;
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
		System.out.println(Diameter(root));

	}

}
