public class ParenDemo{
    public static boolean isMatching(String s){
	MyStack m = new MyStack();
	for(int i = 0; i < s.length(); i++){
	    String pos = s.substring(i,i+1);
	    if(pos.equals("(") || pos.equals("<") || pos.equals("{") || pos.equals("[")){
		m.push(pos);
	    }
	    
	    if(pos.equals(">")){
		if(m.peek().equals("<")){
		    m.pop();
		}
		else{
		    return false;
		}
	    }
	    if(pos.equals("}")){
		if(m.peek().equals("{")){
		    m.pop();
		}
		else{
		    return false;
		}
	    }
	    if(pos.equals("]")){
		if(m.peek().equals("[")){
		    m.pop();
		}
		else{
		    return false;
		}
	    }
	    if(pos.equals(")")){
		if(m.peek().equals("(")){	
		    m.pop();
		}
		else{
		    return false;
		}
	    }
	    System.out.println(m);
	}
	return m.isEmpty();
    }
    public static void main(String[] args){
	String input = "<<>>>";
	if(args.length > 0){
	    input = "<<>";
	   
	}
	 System.out.println(isMatching(input));
    }
}
