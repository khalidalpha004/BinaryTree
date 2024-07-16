package BinaryTree;

public class ReplacerootWithDepth {
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		setDepth(root,0);
		}
		private static void setDepth(BinaryTreeNode<Integer> root,int depth){
			if(root==null){
				return;
			}
			root.data=depth;
			setDepth(root.Left, depth+1);
			setDepth(root.Right, depth+1);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
