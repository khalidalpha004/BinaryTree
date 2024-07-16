package BinaryTree;

public class PathSumPrint {
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		String arr="";
        rootToLeafPathsSumToK(root,k,arr);
	}
    
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String arr)
    {
        if (root==null)
        {
            return;
        }
        
        int rootData=root.data;
        //System.out.println("Root data: "+rootData);
        //System.out.println("k: "+k);
        //System.out.println("Old Arraylist: "+arr);
        arr=arr+rootData+" ";
        if(k==rootData && root.Left==null && root.Right==null)
        {
            //System.out.print("Path found: ");
            //for (int i=0;i<arr.length();i++)
               //System.out.print(arr.charAt(i)+" ");
            //System.out.println();
            System.out.println(arr);
            return;
        }
        //System.out.println();
        
        rootToLeafPathsSumToK(root.Left,k-rootData,arr);
        rootToLeafPathsSumToK(root.Right,k-rootData,arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
