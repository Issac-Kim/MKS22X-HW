import java.util.*;

public class Driver{
    public static void main(String[] args){
	MyHeap<Integer> m = new MyHeap<Integer>(true);
	m.add(new Integer(10));
	System.out.println(m);
	m.add(new Integer(9));
	System.out.println(m);
	m.add(new Integer(8));
	System.out.println(m);
	m.add(new Integer(7));
	System.out.println(m);
	m.add(new Integer(13));
	System.out.println(m);
	m.add(new Integer(13));
	m.add(new Integer(7));
	System.out.println(m);
	System.out.println(m.delete());
	System.out.println(m);
	String[] arr = {"a","b","f","l","z","k","g","m"};
	MyHeap<String> l = new MyHeap<String>(arr, false);
	System.out.println(l);
	Integer[] da = new Integer[30];
	for(int i = 0; i < 30; i++){
	    Integer n = new Integer(i);
	    da[i] = n;
	}
	MyHeap<Integer> k = new MyHeap<Integer>(da, false);
	k.delete();
	k.delete();
	System.out.println(k);
    }
}
