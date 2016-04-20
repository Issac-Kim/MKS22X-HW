public class BSTree<T extends Comparable<T>>{
    Node root;
    public class Node{
	Node left, right;
	T data;
	public Node getLeft(){
	    return left;
	}
	public Node getRight(){
	    return left;
	}	
	public T getData(){
	    return data;
	}
	public void setLeft(Node left){
	    this.left = left;
	}
	public void setRight(Node right){
	    this.right = right;
	}
	public void setData(T data){
	    this.data = data;
	}
    }
}