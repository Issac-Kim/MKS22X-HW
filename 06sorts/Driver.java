public class Driver{
    public static void main(String[] args){
	int[] a = {1, 2, 3, 6, 7};
	int[] b = {2, 10};
	int[] arr = Sorts.merge(a, b);
	int[] ary = {321, 2, 14, 54, -12, 0, 213, 213, 15,13213};
	Sorts.mergesort(ary );
	for(int i = 0; i < ary.length; i++){
	    System.out.print(ary[i] + ",");
	}
    }
}
