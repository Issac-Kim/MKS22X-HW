public class BSTree<T extends Comparable<T>>{
    Node root;

    public BSTree(Node root){
	this.root = root;
    }
    public BSTree(){
	root = null;
    }
    public int getHeight(){
	if(root == null){
	    return 0;
	}else{
	    return root.height();
	}
    }
    public void add(T value){
	if(root == null){
	    root = new Node(value);
	}else{
	    root.add(value);
	}
    }
    public String toString(){
	if(root == null){
	    return "";
	}else{
	    return root.toString();
	}
    }
    public boolean contains(T value){
	if(root == null){
	    return false;
	}else{
	    return root.contains(value);
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
	public int height(){
	    if(getLeft() == null && getRight() == null){
		return 1;
	    }
	    if(getLeft() != null && getRight() != null){
		return 1 + Math.max(getLeft().height(), getRight().height());
	    }
	    else if(getLeft() == null){
		return 1 + getRight().height();
	    }
	    else{
		return 1 + getLeft().height();
	    }
	}
	public void add(T value){
	    if(value.compareTo(getData()) < 0){
		if(getLeft() == null){
		    setLeft(new Node(value));
		}else{
		    getLeft().add(value);
		}
	    }else{
		if(getRight() == null){
		    setRight(new Node(value));
		}else{
		    getRight().add(value);
		}
	    }
	}
	public String toString(){
	    String ans = getData() + " ";
	    if(getLeft() == null){
		ans += "_ ";
	    }else{
		ans += getLeft().toString();
	    }
	    if(getRight() == null){
		ans += "_ ";
	    }else{
		ans += getRight().toString();
	    }
	    return ans;
	}
	public boolean contains(T value){
	    if(getData() == value){
		return true;
	    }
	    if(getLeft() == null && getRight() == null){
		return false;
	    }
	    else if(value.compareTo(getData()) < 0){
		return getLeft().contains(value);
	    }
	    else if(value.compareTo(getData()) > 0){
		return getRight().contains(value);
	    }
	    return false;
	}
    }

}
