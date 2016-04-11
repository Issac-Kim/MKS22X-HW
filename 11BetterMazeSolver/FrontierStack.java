import java.util.*;
public class FrontierStack<T> extends MyStack<T> implements Frontier<T>{
    public FrontierStack(){
	super();
    }
    public void add(T element){
	push(element);
    }
    public T next(){
	return pop();
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
