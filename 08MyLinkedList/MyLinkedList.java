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
    public boolean add(int index, int val){
	LNode current = start;
	for(int i = 0; i < index; i++){
	    current = current.getNext();
	}
	int temp = current.get();
	LNode next = current.getNext();
	current.set(val);
	current = current.getNext();
	current.set(temp);
	current.setNext(next);
	size++;
	return true;
    }
    public int remove(int index){
	LNode current = start;
	for(int i = 0; i < index; i++){
	    current = current.getNext();
	}
	int temp = current.get();
	LNode next = current.getNext();
	LNode head = start;
	for(int i = 0; i < index - 1; i++){
	    head = head.getNext();
	}
	head.setNext(next);
	size--;
	return temp;
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
    public int get(int index){
	LNode current = start;
	for(int i = 0; i < index; i++){
	    current = current.getNext();
	}
	return current.get();
    }
    public int set(int index, int newVal){
	LNode current = start;
	for(int i = 0; i < index; i++){
	    current = current.getNext();
	}
	int temp = current.get();
	current.set(newVal);
	return temp;
    }
    public int size(){
	return size;
    }
    public int indexOf(int val){
	LNode current = start;
	for(int i = 0; i < size; i++){
	    if(current.get() == val){
		return i;
	    }
	    current = current.getNext();
	}
	if(current.get() != val){
	    return -1;
	}
	else{
	    return size - 1;
	}
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
