package BinaryTree;

public class CreateAndInsertDuplicateOnLeftOfTree {
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null){
			return;
		}
		 insertDuplicateNode(root.Left);
		  insertDuplicateNode(root.Right);
		  BinaryTreeNode<Integer> node=new BinaryTreeNode<>(root.data);
		  BinaryTreeNode<Integer> temp=root.Left;
		  root.Left=node;
		  node.Left=temp;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
