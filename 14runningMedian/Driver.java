import java.util.*;

public class Driver{
    public static void main(String[] args){
	RunningMedian m = new RunningMedian();
	m.add(new Integer(10));
	m.add(new Integer(10));
	System.out.println(m);
	RunningMedian l = new RunningMedian();
	for(int i = 0; i < 20; i++){
	    Integer s = new Integer(i);
	    m.add(s);
	}
	System.out.println(m);
	for(int i = 20; i > 10; i--){
	    Integer s = new Integer(i);
	    l.add(s);
	}
	l.add(new Integer(1));
	System.out.println(l);
    }
}
