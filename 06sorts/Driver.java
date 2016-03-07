public class Driver{
    public static void main(String[] args){
	int[] a = {1, 2, 3, 6, 7};
	int[] b = {2, 10};
	int[] arr = Sorts.merge(a, b);
	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ",");
	}
    }
}
