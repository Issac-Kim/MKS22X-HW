public class Driver{
    public static void main(String[] args){
	MyDeque<String> d = new MyDeque<String>();
	for(int i = 0; i < 30; i++){
	    d.addFirst("" + i);
	}
	System.out.println(d);
	//System.out.println(d.size);
	System.out.println(d.string());
    }
}
