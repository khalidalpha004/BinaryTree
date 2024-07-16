package BinaryTree;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> Left;
    BinaryTreeNode<T> Right;
    public  BinaryTreeNode(T data) {
    	this.data=data;
    	Left=null;
    	Right=null;
    }
}
