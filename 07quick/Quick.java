import java.util.*;

public class Quick{
    public static int partition(int[] data, int left, int right){
	Random rand = new Random();
	//int index = 6;
	int index = rand.nextInt(right - left + 1) + left;
	int val = data[index];
	int r = right;
	//	System.out.println("\n val:" + val + "index:" + index);
	
	for(int i = left; i < right + 1; i++){
	    if(data[i] > val && i < r){
		int temp = data[r];
		data[r] = data[i];
		data[i] = temp;
		i -= 1;
		r -= 1;
	    }
	    else if(data[i] < val && i > index){
		data[index] = data[i];
		data[i] = val;
		index = i;
	    }
	}
	return index;
    }
    public static int quickselect(int[] data, int k){
	
	return help(data, k, 0, data.length -1);
	
    }
    public static int help(int[] data, int k, int left, int right){
	int index = partition(data, left, right);
	//System.out.println(left + "," + right);
	//System.out.println(toString(data));
	if(index == k){
	    return data[k];
	}
	else if(index > k){
	    return help(data, k, left, index);
	}
	else{
	    return help(data, k, index, right);
	}
    }
    
    public static String toString(int[] data){
	String s ="";
	for(int i = 0; i < data.length; i++){
	    s += data[i] + ",";
	}
	return s;
    }
}
