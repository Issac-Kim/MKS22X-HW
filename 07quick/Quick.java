import java.util.*;

public class Quick{
    public static int partition(int left, int right){
	Random rand = new Random();
	int index = rand.nextInt(right - left + 1) + left;
	return index;
    }
}
