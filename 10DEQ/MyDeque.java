import java.util.*;

public class  MyDeque<T>{
    int size;
    int first;
    int last;
    T[] data;
    @SuppressWarnings("unchecked")
    public MyDeque(){
	data = (T[]) new Object[10];
	first = 0;
	last = 0;
	size = 0;
    }
    private void grow(){
	T[] arr = (T[]) new Object[size * 2];
	for(int i = 0; i < size; i++){
	    arr[i] = data[(first + i) % size]; 
	}
	for(int i = 0; i < size; i++){
	    data[i] = arr[i];
	    last = i;
	}
	first = 0;
    }
    public void addFirst(T value){
	if(size == data.length){
	    grow();
	}
	int index = first - 1;
	if(index < 0){
	    index = size - 1;
	}
	data[index] = value;
	size++;
    }
    public void addLast(T value){
	if(size == data.length){
	    grow();
	}
	int index = last + 1;
	if(index == size){
	    index = 0;
	}
	data[index] = value;
	size++;
    }
    public T removeFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	else{
	    T temp = data[first];
	    data[first] = null;
	    size--;
	    first = (first + 1)%size;
	    return temp;
	}
    }
    public T removeLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	else{
	    T temp = data[last];
	    data[last] = null;
	    size--;
	    last = (last - 1)%size;
	    return temp;
	}
    }
    public T getFirst(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	else{
	    return data[first];
	}
    }
    public T getLast(){
	if(size == 0){
	    throw new NoSuchElementException();
	}
	else{
	    return data[last];
	}
    }
    public String toString(){
	String s = "";
	for(int i = 0; i < size; i++){
	    s += data[(first + i) % size] + ",";
	}
	return s;
    }
}
