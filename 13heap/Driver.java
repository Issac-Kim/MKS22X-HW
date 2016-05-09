import java.util.*;

public class Driver{
    public static void main(String[] args){
	MyHeap<Integer> m = new MyHeap<Integer>();
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
	m.add(new Integer(11));
	System.out.println(m);
	m.delete();
	System.out.println(m);
	String[] arr = {"a","b","f","l","z","k","g","m"};
	MyHeap<String> l = new MyHeap<String>(arr);
	System.out.println(l);
    }
}
