public  class Sorts{
    public void mergeSort(int[] ary){

    }
    public static int[] merge(int[] a, int[] b){
	int A = 0;
	int B = 0;
	int i = 0;
	int[] arr = new int[a.length + b.length];
	while(A < a.length  && B < b.length){
	    if(a[A] <= b[B]){
		arr[i] = a[A];
		A++;
	    }
	    else{
		arr[i] = b[B];
		B++;
	    }
	    i++;
	}
	for(int k = A; k < a.length; k++){
	    arr[i] = a[k];
	    i++;
	}
	for(int k = B; k < b.length; k++){
	    arr[i] = b[k];
	    i++;
	}
	return arr;
    }
}
