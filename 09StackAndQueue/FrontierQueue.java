import java.util.*;
public class FrontierQueue<T> extends MyQueue<T> implements Frontier<T>{
    public FrontierQueue(){
	super();
    }
    public void add(T element){
	enqueue(element);
    }
    public T next(){
	return dequeue();
    }
    public boolean hasNext(){
	try{
	    peek();
	    return true;
	}catch(NoSuchElementException e){
	    return false;
	}
    }
}
