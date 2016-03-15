public class MyLinkedList{
    LNode start;
    int size;
    
    public MyLinkedList(){
	start = new LNode();
	size = 0;
    }

    public void add(int n){
	if(start != null){
	    LNode current = start;
	    while(current.hasNext()){
		current = current.getNext();
	    }
	    current.setNext(n);
	}
	else{
	    start.set(n);
	}
	size++;
    }
    public String toString(){
	LNode current = start;
	String s = "";
	s += current.get() + ",";
	while(current.hasNext()){
	    current = current.getNext();
	    s += current.get() + ",";
	}
	return s;
    }
    public int get(int index){
	
    }
    private class LNode{
	int val;
	LNode next;
	private LNode(){
	    
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
	private int setNext(int num){
	    next = new LNode();
	    return next.set(num);
	}
    }
}
