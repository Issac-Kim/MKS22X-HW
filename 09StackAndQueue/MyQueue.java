import java.util.*;
public class MyQueue<T> extends MyLinkedList<T>{
    public MyQueue(){
	super();
    }
    public void enqueue(T item){
	add(item);
    }
    public T dequeue(){
	if(!isEmpty()){
	    return remove(0);
	}
	else{
	    throw new NoSuchElementException();
	}
    }
    public T peek(){
	if(!isEmpty()){
	    return get(0);
	}
	else{
	    throw new NoSuchElementException();
	}	
    }
    public int size(){
	return super.size();
    }
    public boolean isEmpty(){
	if(size() > 0){
	    return true;
	}
	return false;
    }
}
