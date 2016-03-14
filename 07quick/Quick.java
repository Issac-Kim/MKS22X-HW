import java.util.*;

public class Quick{
    public static int partitionOld(int[] data, int left, int right){
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
    
    public static int[] partition(int[] data, int left, int right){
	int[] ans = new int[]{1,1};
	Random rand = new Random();
	//int index = 5;
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
	int end = l + 1;
	for(int i = l + 1; i < right + 1; i++){
	    if(data[i] == val){
		data[i] = data[end];
		data[end] = val;
		end++;
	    }
	}
	ans[0] = l;
	ans[1] = end - 1;
	return ans;
    }
    
    public static int quickSelectOld(int[] data, int k){
	
	return help(data, k, 0, data.length -1);
	
    }

    public static int quickSelect(int[] data, int k){
	return quickSelect(data, k, 0, data.length - 1);
    }
    public static int help(int[] data, int k, int left, int right){
	int index = partitionOld(data, left, right);
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
    public static int quickSelect(int[] data, int k, int left, int right){
	int[] index = partition(data, left, right);
	if(left == right){
	    return data[left];
	}
	if(index[0] <= k && index[1] >= k){
	    return data[index[0]];
	}
	else if(index[0] > k){
	    return quickSelect(data, k, left, index[0] - 1);
	}
	else{
	    return quickSelect(data, k, index[1] + 1, right);
	}
    }

    public static String name(){
	return "6,Kim,Issac"; //e.g. "7,Kim,Bob"
    }

    public static void quickSortOld(int[] data, int left, int right){
	if(left < right){
	    int index = partitionOld(data, left, right);
	    quickSortOld(data, left, index-1);
	    quickSortOld(data, index+1, right);
	}
	}
    
    public static void quickSort(int[] data, int left, int right){
	if(left < right){
	    int[] range = partition(data, left, right);
	    quickSort(data, left, range[0]-1);
	    quickSort(data, range[1]+1, right);
	}
    }

    public static void quickSortOld(int[] data){
	quickSortOld(data, 0, data.length - 1);
    }

    public static void quickSort(int[] data){
	quickSort(data, 0, data.length -1);
    }
    
    public static String toString(int[] data){
	String s ="";
	for(int i = 0; i < data.length; i++){
	    s += data[i] + ",";
	}
	return s;
    }
}
