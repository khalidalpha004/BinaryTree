package BinaryTree;

import java.util.Scanner;

public class TakingInputFromUser {
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
    public static BinaryTreeNode<Integer> TakeInputLevelWise(boolean isRoot,int parent,boolean isLeft){
    	if(isRoot) {
    		System.out.println("enter root data");
    	}else {
    		if (isLeft){
    		System.out.println("enetr left child" +parent);
    		}
    	   else {
    		System.out.println("enter right child" +parent);
    	       }
    		}
    	Scanner s=new Scanner(System.in);

    	int data=s.nextInt();
    	if(data==-1) {
    		return null;
    	}
    	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
//    	System.out.println("Enter " + root.data + " left subTree data");
    	BinaryTreeNode<Integer> rootLeft=TakeInputLevelWise(false,data,true);
//    	System.out.println("Enter " + root.data + " Right subTree data");
    	BinaryTreeNode<Integer> rootRight=TakeInputLevelWise(false,data,false);
    	root.Left=rootLeft;
    	root.Right=rootRight;
    	return root;
    	
    }
    
    public static void PrintTreeDetailed(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return ;
    	}
    	System.out.print(root.data +":"   );
    	if(root.Left!=null) {
    		System.out.print("L" +root.Left.data +",");
    	}
    	if(root.Right!=null) {
    		System.out.print("R"+root.Right.data);
    	}
    	System.out.println();

    	PrintTreeDetailed(root.Left);
    	PrintTreeDetailed(root.Right);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root=TakeInput();
		BinaryTreeNode<Integer> root=TakeInputLevelWise(true,0,false);
		PrintTreeDetailed(root);

	}

}
