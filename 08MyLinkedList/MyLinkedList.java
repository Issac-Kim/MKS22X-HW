public class MyLinkedList{
    LNode start;
    int size;
    
    public boolean add(int n){
	LNode current = start;
	if(start == null){
	    start = new LNode(n);
	}
	else{
	    while(current.getNext() != null){
		current = current.getNext();
	    }
	    current.setNext(new LNode(n));
	}
	size++;
	return true;
    }
    public int remove(int index){
	
    }
    public String toString(){
	LNode current = start;
	String s = "";
	while(current != null){
	    s += current.get() + ",";
	    current = current.getNext();
	    
	}
	return s;
    }
  
    private class LNode{
	int val;
	LNode next;
	private LNode(int v){
	    val = v;
	}
	private int get(){
	    return val;
	}
	private LNode getNext(){
	    return next;
	}
	private int set(int num){
	    int temp = val;
	    val = num;
	    return temp;
	}
	private boolean hasNext(){
	    if(next == null){
		return false;
	    }
	    return true;
	}
	private void setNext(LNode n){
	    next = n;
	}
    }
}
