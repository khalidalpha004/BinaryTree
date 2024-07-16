package BinaryTree;

import java.util.Scanner;

public class MirrorImageOfTree {
    public static void mirrorImage(BinaryTreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	if(root.Left==null && root.Right==null) {
    		return;
    	}
    	mirrorImage(root.Left);
    	mirrorImage(root.Right);
    	BinaryTreeNode<Integer> temp=root.Left;
    	root.Left=root.Right;
    	root.Right=temp;
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
		BinaryTreeNode<Integer> root=TakeInput();
		mirrorImage(root);
		PrintTreeDetailed(root);

	}

}
