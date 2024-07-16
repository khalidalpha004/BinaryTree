package BinaryTree;

public class TotalNodesX {
    public static int NodesGreaterX(BinaryTreeNode<Integer> root,int x) {
    	if(root==null) {
    		return 0;
    	}
    	int left=NodesGreaterX(root.Left,x);
    	int right=NodesGreaterX(root.Right,x);
    	if(root.data<x && root.Left==null && root.Right==null) {
    		return 0;
    	}
    	if(root.data>=x) {
    		return 1+left+right;
    	}else {
    	return left+right;
    	}

    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
