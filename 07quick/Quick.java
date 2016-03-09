import java.util.*;

public class Quick{
    public static int partition(int[] data, int left, int right){
	Random rand = new Random();
	int index = rand.nextInt(right - left + 1) + left;
	int val = data[index];
	for(int i = left; i < right + 1; i++){
	    if(data[i] < val && i > index){
		int temp = data[i];
		data[i] = val;
		val = temp;
		index = i;
	    }
	    else if(data[i] > val && i < index){
		int temp = data[i];
		data[i] = val;
		val = temp;
		index = i;
	    }
	}
	return index;
    }
}
