import java.util.*;
public class MyStack<T> extends MyLinkedList<T>{
    public MyStack(){
	super();
    }
    public void push(T item){
	add(0,item);
    }
    public T pop(){
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
