public class Sorts{
    public static void mergesort(int[] ary){
	int data[] = mergeH(ary, 0, ary.length - 1);
	for(int i = 0; i < data.length; i++){
	    ary[i] = data[i];
	}
    }
    public static int[] mergeH(int[] ary, int start, int end){
	//System.out.println(start + "," + end);
	if(start == end){
	    int[]arr= new int[1];
	    arr[0] = ary[start];
	    return arr;
	}
	int[] a = mergeH(ary, start, (end-start)/2  + start);
	int[] b = mergeH(ary, (end-start)/2 + start + 1, end);
	int data[] = merge(a,b);
	return data;
   
	
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
    public static String name(){
	return "6,Kim,Issac";
    }
}
