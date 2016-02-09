public class Recursion{
    public String name(){
	return "Kim,Issac";
    }
    public Recursion(){
    }
    public double sqrt(double n){
	if(n < 0){
	    throw new IllegalArgumentException();
	}
	else{
	    return sqrtHelper(n,1);
	}
    }
    public double sqrtHelper(double n, double guess){
	if(n == 0){
	    return 0;
	}
	if(Math.abs((n-guess*guess)/n) < .00001){
	    return guess;
	}
	else{
	    
	    return sqrtHelper(n, (n/guess+guess)/2);
	}
    }
    
}
