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
	while(Math.abs(min.getSize() - max.getSize()) >= 2){
	    if(max.getSize() > min.getSize()){
		min.add(max.delete());
	    }
	    else{
		max.add(min.delete());
	    }
	}
    }

    public String toString(){
	if(max.getSize() == min.getSize()){
	    return max.toString() + "-" + getMedian() + "-" + min.toString();
	}
	else{
	    if(max.getSize() > min.getSize){
		Integer temp = max.delete();
		String ans = max.toString() + "-" + temp.toString() + "-" + min.toString();
		max.add(temp);
	    }
	    if(max.getSize() < min.getSize){
		Integer temp = min.delete();
		String ans = max.toString() + "-" + temp.toString() + "-" + min.toString();
		min.add(temp);
	    }
	    return ans;
	}
    }
}