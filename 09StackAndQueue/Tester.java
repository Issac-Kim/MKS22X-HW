import java.util.*;
public class Tester{
    public static void main(String[] args){
	Stack<String> s = new Stack<String>;
	MyStack<String> myS = new MyStack<String>;
	Queue<String> q = new Queue<String>;
	MyQueue<String> myQ = new MyQueue<String>;
	for(int i = 0; i < 100; i++){
	    String s = "" + i;
	    s.push(s);
	    myS.push(s);
	    q.enqueue(s);
	    myQ.enqueue(s);
	}
    }
}
