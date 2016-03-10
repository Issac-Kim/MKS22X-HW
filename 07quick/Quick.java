import java.util.*;

public class Quick{
    public static int partition(int[] data, int left, int right){
	Random rand = new Random();
	//int index = 6;
	int index = rand.nextInt(right - left + 1) + left;
	int val = data[index];
	int l = left;
	data[index] = data[right];
	data[right] = val;
	
	//	System.out.println("\n val:" + val + "index:" + index);

	
	
	
	for(int i = left; i < right; i++) {
	    if(data[i] < val) {
		int temp = data[l];
		data[l] = data[i];
		data[i] = temp;
		l++;
	    }
	}
	data[right] = data[l];
	data[l] = val;
	return l;
    }
    
    
    public static int quickselect(int[] data, int k){
	
	return help(data, k, 0, data.length -1);
	
    }
    public static int help(int[] data, int k, int left, int right){
	int index = partition(data, left, right);
	if(left == right){
	    return data[left];
	}
	//System.out.println(left + "," + right);
	//System.out.println(toString(data));
	if(index == k){
	    return data[index];
	}
	else if(index > k){
	    return help(data, k, left, index - 1);
	}
	else{
	    return help(data, k, index + 1, right);
	}
    }

    public static String name(){
	return "6,Kim,Issac"; //e.g. "7,Kim,Bob"
    }

    public static void quickSort(int[] data, int left, int right){
	if(left < right){
	    int index = partition(data, left, right);
	    quickSort(data, left, index);
	    quickSort(data, index+1, right);
	}
    }

    public static void quickSort(int[] data){
	quickSort(data, 0, data.length - 1);
    }
    
    public static String toString(int[] data){
	String s ="";
	for(int i = 0; i < data.length; i++){
	    s += data[i] + ",";
	}
	return s;
    }
}
