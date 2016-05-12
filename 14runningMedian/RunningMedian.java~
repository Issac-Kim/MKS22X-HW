import java.util.*;

public class RunningMedian{
    private MyHeap<Integer> min, max;
    
    public RunningMedian(){
	min = new MyHeap<Integer>();
	max = new MyHeap<Integer>();
    }
    
    public double getMedian(){
	if(min.getSize() == max.getSize()){
	    return (min.peek() + max.peek())/2.0;
	}
	else{
	    if(min.getSize() > max.getSize()){
		return min.peek();
	    }
	    else{
		return max.peek();
	    }
	}
    }

    public void add(Integer n){
	if(n.compareTo(getMedian()) < 1){
	    max.add(n);
	}
	else{
	    min.add(n);
	}
	balance();
    }
    
    public void balance(){
	if(Math.abs(min.getSize() - max.getSize()) >= 2){
	    if(max.getSize() > min.getSize()){
		min.add(max.delete());
	    }
	    else{
		max.add(min.delete());
	    }
	}
    }
}
