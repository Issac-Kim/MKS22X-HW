public class Recursion{
    public String name(){
	return "Kim,Issac";
    }
    public Recursion(){
    }
    public double sqrt(double n){
	if(n < 0){
	    throw new IllegalArgumentException;
	}
	return sqrtHelper(n,1);
    }
    public double sqrtHelper(double n, double guess){
	if((n-(guess*guess))/n < .00001){
	    return guess;
	}
	else{
	    return sqrtHelper(n, (n/guess+guess)/2);
	}
    }
    
}
