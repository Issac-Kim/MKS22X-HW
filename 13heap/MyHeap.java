import java.util.*;
 @SuppressWarnings({"unchecked"})


public class MyHeap<T extends Comparable<T>>{
    private T[] data;
    private int size;
    boolean isMax = true;
    public MyHeap(){
	data = (T[]) new Comparable[10];
	size = 0;
    }
    public MyHeap(T[] Array){
	data = (T[]) new Comparable[Array.length + 1];
	size = Array.length;
	heapify(Array);
	
    }
    public MyHeap(boolean Max){
	this();
	isMax = Max;
    }
    public MyHeap(T[] arr, boolean Max){
	this(arr);
	isMax = Max;
    }
    private boolean compare(T x, T y){
	if(isMax){
	    return x.compareTo(y) > 0;
	}
	else{
	    return x.compareTo(y) < 0;
	}
    }
    private void pushDown(int k){
	if(k < 0 || k > size){
	    throw new IndexOutOfBoundsException();
	}
	int index = k;
	while(index * 2 + 1 <= size && (!compare(data[index], data[index*2]) || !compare(data[index], data[index*2 + 1]))){
	    T temp = data[index];
	    if(!compare(data[index*2],data[index*2+1])){
		data[index] = data[index*2+1];
		data[index*2+1] = temp;
		index = index * 2 +1;
	    }
	    else{
		data[index] = data[index*2];
		data[index*2] = temp;
		index = index * 2;
	    }
	}
	if(index * 2 <= size && !compare(data[index], data[index * 2])){
	    T temp = data[index];
	    data[index] = data[index * 2];
	    data[index * 2] = temp;
	}
    }
    private void pushUp(int k){
	if(k < 0 || k > size){
	    throw new IndexOutOfBoundsException();
	}
	int index = k;
	while(index > 1 && compare(data[index], data[index/2])){
	    if(compare(data[index], data[index/2])){
		T temp = data[index];
		data[index] = data[index/2];
		data[index/2] = temp;
	    }
	    index = index/2;
	}
    }
    public void heapify(T[] arr){
	for(int i = 0; i < arr.length; i++){
	    data[i + 1] = arr[i];
	}
	for(int i = size/2; i > 0; i--){
	    pushDown(i);
	}
    }
    public T delete(){
	T temp = data[1];
	data[1] = data[size];
	pushDown(1);
	size--;
	return temp;
    }
    public void add(T x){
	if(size == data.length -1){
	    doubleSize();
	}
	if(size == 0){
	    data[1] = x;
	    size++;
	}
	else{
	    data[size + 1] = x;
	    int index = size + 1;
	    size++;
	    pushUp(index);
	}
	    
    }
    public T peek(){
	return data[1];
    }
        private void doubleSize(){
	T[] temp = (T[]) new Comparable[data.length];
	for(int i = 0; i < data.length; i++){
	    temp[i] = data[i];
	}
	data = (T[]) new Comparable[data.length * 2];
	for(int i = 1; i < temp.length; i++){
	    data[i] = temp[i];
	}
	
    }
    public String toString(){
	String ans = "";
	for(int i = 1; i < size + 1; i++){
	    ans += data[i] + " ";
	}
	return ans;
    }
}
