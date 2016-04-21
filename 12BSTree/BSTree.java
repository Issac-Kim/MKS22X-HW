public class BSTree<T extends Comparable<T>>{
    Node root;

    public BSTree(Node root){
	this.root = root;
    }
    public BSTree(){
    }
    public void add(T value){
	add(value, root);
    }
    public void add(T value, Node localRoot){
	if(localRoot == null){
	    localRoot = new Node(value);
	}
	else if(value.compareTo(localRoot.getData()) < 0){
	    add(value, localRoot.getLeft());
	}
	else{
	    add(value, localRoot.getRight());
	}
    }
    
    public class Node{
	Node left, right;
	T data;
	public Node(T value){
	    data = value;
	}
	public Node(T value, Node left, Node right){
	    data = value;
	    this.left = left;
	    this.right = right;
	}
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
	public int numChildren(){
	    int num = 0;
	    if(getLeft() != null){
		num++;
	    }
	    if(getRight() != null){
		num++;
	    }
	    return num;
	}
    }

}
