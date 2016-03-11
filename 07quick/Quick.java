import java.util.*;

public class Quick{
    public static int partition(int[] data, int left, int right){
	Random rand = new Random();
	int index = rand.nextInt(right - left + 1) + left;
	int val = data[index];
	int l = left;
	data[index] = data[right];
	data[right] = val;
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
    
    public static int[] partition2(int[] data, int left, int right){
	Random rand = new Random();
	//int index = rand.nextInt(right - left + 1) + left;
	int index = 5;
	int val = data[index];
	int l = left;
	int r = right - 1;
	data[index] = data[right];
	data[right] = val;
	for(int i = left; i < right; i++) {
	    if(data[i] == val){
		int temp = data[r];
		data[r] = data[i];
		data[i] = temp;
		r--;
	    }
	    else if(data[i] < val) {
		int temp = data[l];
		data[l] = data[i];
		data[i] = temp;
		l++;
	    }
	}
	for(int i = 0; i < right - r; i++){
	    data[r + i + 1] = data[l + i -1];
	    data[l + i -1] = val;
	}
	int[] range = {l,r};
	return range;
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
    
    public static void quickSort2(int[] data, int left, int right){
	if(left < right){
	    int[] range = partition2(data, left, right);
	    quickSort(data, left, range[0]-1);
	    quickSort(data, range[1]+1, right);
	}
    }

    public static void quickSort(int[] data){
	quickSort(data, 0, data.length - 1);
    }

    public static void quickSort2(int[] data){
	quickSort2(data, 0, data.length -1);
    }
    
    public static String toString(int[] data){
	String s ="";
	for(int i = 0; i < data.length; i++){
	    s += data[i] + ",";
	}
	return s;
    }
}
