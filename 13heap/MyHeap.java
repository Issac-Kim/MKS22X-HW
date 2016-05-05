import java.util.*;
@SuppressWarnings("unchecked")

public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size;
    boolean isMax = true;
    
    public MyHeap(){
	data = new T[10];
	size = 0;
    }
    public MyHeap(T[] Array){
	data = heapify(Array);
	size = Array.length;
    }

    private void pushDown(int k){
	T temp = data[k];
	if(data[k*2].compareTo(data[k*2+1]) < 0){
	    data[k] = data[k*2+1];
	    data[k*2+1] = temp;
	}
	else{
	    data[k] = data[k*2];
	    data[k*2] = temp;
	}
    }
    private void pushUp(int k){
	T temp = data[k];
	data[k] = data[k/2];
	data[k/2] = temp;
    }
    private void heapify(T[] arr){
	
    }
    public T delete(){
	return data[0];
    }
    public void add(T x){
	if(size == data.length -1){
	    doubleSize();
	}
	if(size == 0){
	    data[1] = T;
	}
    }
    private void doubleSize(){

    }
    public String toString(){
	return "";
    }
}
