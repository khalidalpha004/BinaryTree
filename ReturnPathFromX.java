package BinaryTree;

import java.util.ArrayList;

public class ReturnPathFromX {
    public static ArrayList<Integer>  ReturnPath(BinaryTreeNode<Integer> root,int x){
    	
    	if(root==null) {
    		return null;
    	}
    	if(root.data==x) {
    		ArrayList<Integer> output=new ArrayList<Integer> ();
    		output.add(x);
    		return output;
    	}
    	ArrayList<Integer> leftOutput=ReturnPath(root.Left,x);
    	if(leftOutput!=null) {
    		
    		leftOutput.add(root.data);
    		return leftOutput;
    	}
    	ArrayList<Integer> rightOutput=ReturnPath(root.Right,x);
    	 if(rightOutput!=null) {
    		
    		 rightOutput.add(root.data);
    		return rightOutput;
    	}
    	
    	return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
