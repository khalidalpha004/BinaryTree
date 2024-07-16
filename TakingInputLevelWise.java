package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakingInputLevelWise {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		Queue<BinaryTreeNode<Integer>> pendingChild=new LinkedList<BinaryTreeNode<Integer>>();
		pendingChild.add(root);
		while(!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> front=pendingChild.poll();
			System.out.print(front.data +":");
			if(front.Left!=null) {
				pendingChild.add(front.Left);
				System.out.print("L " +front.Left.data +",");
			}
			if(front.Right!=null) {
				pendingChild.add(front.Right);
				System.out.print("R " +front.Right.data);
			}
			System.out.println();
		
		}
		
		
	
	}
	public static BinaryTreeNode<Integer> TakeInput(){
		Scanner s=new Scanner(System.in );
		System.out.println("enter root data");
		int rootdata=s.nextInt();
		if(rootdata==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		Queue<BinaryTreeNode<Integer>> pendingChild=new LinkedList<BinaryTreeNode<Integer>>();
		pendingChild.add(root);
		while(!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> front=pendingChild.poll();
			System.out.println("enter leftChild " +front.data);
			int leftdata=s.nextInt();
			if(leftdata!=-1) {
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer> (leftdata);
				front.Left=leftChild;
				pendingChild.add(leftChild);
			}
			
			System.out.println("enter rightChild " +front.data);
			int rightdata=s.nextInt();
			if(rightdata!=-1) {
				BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<Integer> (rightdata);
				front.Right=rightChild;
				pendingChild.add(rightChild);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer>root= TakeInput();
		printLevelWise(root);
		

	}

}
