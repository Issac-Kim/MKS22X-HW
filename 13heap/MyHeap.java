import java.util.*;
@SuppressWarnings("unchecked")

public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size = 0;
    boolean isMax = true;
    
    public MyHeap(){
	data = new T[10];
    }
    public MyHeap(T[] Array){
	data = heapify(Array);
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

    }
    private void doubleSize(){

    }
    public String toString(){
	return "";
    }
}
