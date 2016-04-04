public MyDeque<T>{
    int size;
    int first;
    int last;
    Object[] data;
    public MyDeque(){
	size = size * 2;
	data = new T[size];
	T[] temp = T[size];
	temp = grow();
	data = temp;
    }
    public Object[] grow(){
	Object[] arr = new Object[size*2];
	for(int i = 0; i < size; i++){
	    arr[i] = data[(first + i) % size]; 
	}
	return arr;
    }
    public void addFirst(T value){

    }
    public void addLast(T value){

    }
    public String toString(){
	String s = "";
	for(int i = 0; i < size; i++){
	    s += data[(first + i) % size] + ",";
	}
	return s;
    }
}
