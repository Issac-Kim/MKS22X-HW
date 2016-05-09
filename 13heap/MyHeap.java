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
    private boolean compare(T x, T y){
	if(isMax){
	    return x.compareTo(y) > 0;
	}
	else{
	    return x.compareTo(y) < 0;
	}
    }
    private void pushDown(int k){
	T temp = data[k];
	if(!compare(data[k*2],data[k*2+1])){
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
    public void heapify(T[] arr){
	for(int i = 0; i < arr.length; i++){
	    data[i + 1] = arr[i];
	}
	if(size > 1){
	    int index = size / 2;
	    while(index != 1){
		for(int i = 0; i < index; i++){
		    if(((index + i) * 2 +1 <= size)&&(!compare(data[index + i], data[(index + i) * 2]) ||!compare(data[index + i], data[(index + i) *2 + 1]))){
			pushDown(index + i);
		    }
		}
		index = index / 2;
		
	    }
	
	    
	}
    }
    public T delete(){
	T temp = data[1];
	if(size == 1){
	    data[1] = null;
	    size--;
	}
	else{
	    data[1] = null;
	    int index = 1;
	    while(index < size/2){
		if(compare(data[index * 2], data[index * 2 + 1])){
		    index = index * 2;
		}
		else{
		    index = index * 2 + 1;
		}
		pushUp(index);
		
	    }
	    size--;
	}
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
	    while(index > 1 && compare(data[index], data[index/2])){
		pushUp(index);
		index = index/2;
	    }
	    size++;
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
