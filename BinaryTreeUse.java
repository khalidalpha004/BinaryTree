package BinaryTree;

public class BinaryTreeUse {
	public static void PrintTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		PrintTree(root.Left);
		PrintTree(root.Right);
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
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft=new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright=new BinaryTreeNode<Integer>(3);
		root.Left=rootleft;
		root.Right=rootright;
		BinaryTreeNode<Integer> tworight=new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeleft=new BinaryTreeNode<Integer>(5);
		rootleft.Right=tworight;
		rootright.Left=threeleft;
		PrintTree(root);

	}

}
