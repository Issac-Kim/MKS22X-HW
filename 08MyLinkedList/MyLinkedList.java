public class MyLinkedList<T>{
    LNode<T> start;
    LNode<T> end;
    int size;
    
    public boolean add(T thing){
	LNode<T> current = start;
	if(start == null){
	    start = new LNode<T>(thing);
	}
	else{
	    while(current.getNext() != null){
		current = current.getNext();
	    }
	    current.setNext(new LNode<T>(thing));
	}
	size++;
	return true;
    }
    public boolean add(int index, T thing){
	if(index < 0 || index > size){
	    IndexOutOfBoundsException e = new IndexOutOfBoundsException();
	    throw e;
	    return false;
	}
	else{
	    if(index == size){
		add(thing);
	    }
	    else if(index == 0){
		LNode<T> temp = new LNode(thing);
		temp.setNext(start);
	    start = temp;
	    }
	    else{
		LNode<T> current = start;
		for(int i = 0; i < index; i++){
		    current = current.getNext();
		}
	    LNode<T> temp = current;
	    current.set(thing);
	    current.setNext(temp);
	    }
	    size++;
	    return true;
	}
    }
    public int remove(int index){
	if(index < 0 || index >= size){
	    IndexOutOfIndexException e = new IndexOutOfBoundException();
	    throw e;
	    
	}
	LNode<T> current = start;
	for(int i = 0; i < index; i++){
	    current = current.getNext();
	}
	int temp = current.get();
	LNode<T> next = current.getNext();
	LNode<T> head = start;
	for(int i = 0; i < index - 1; i++){
	    head = head.getNext();
	}
	head.setNext(next);
	size--;
	return temp;
    }
    public String toString(){
	LNode<T> current = start;
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
    private class LNode<T>{
	T thing;
	LNode<T> =  next;
	private LNode(T thing){
	    this.thing = thing;
	}
	private int get(){
	    return thing;
	}
	private LNode<T> getNext(){
	    return next;
	}
	private int set(T thing){
	    T temp = this.thing;
	    this.thing = thing;
	    return temp;
	}
	private boolean hasNext(){
	    if(next == null){
		return false;
	    }
	    return true;
	}
	private void setNext(LNode<T> n){
	    next = n;
	}
    }
}
