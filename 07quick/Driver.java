public class Driver{
    public static void main(String[] args){
	int[] data = {1,321,-12,0,123,4,51,23,42,124};
	for(int i = 0; i < data.length; i++){
	    data = new int[]{1,321,-12,0,123,4,51,23,42,124};
	    System.out.println(Quick.quickselect(data, i));
	}
	
    }
}
