public MyDeque<T>{
    int size;
    int first;
    int last;
    T[] data;
    @SupressWarnings("unchecked")
    public MyDeque(){
	data = (T[]) new Object[10];
	first = 0;
	last = 0;
	size = 0;
    }
    private void grow(){
	T[] arr = new (T[]) new Object[size * 2];
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
    }
    public void addLast(T value){
	if(size == data.length){
	    grow();
	}
	int index = last + 1;
	if(index == size()){
	    index = 0;
	}
	data[index] = value;
    }
    public String toString(){
	String s = "";
	for(int i = 0; i < size; i++){
	    s += data[(first + i) % size] + ",";
	}
	return s;
    }
}
