public class Driver{
    public static void main(String[] args){
	Board b = new Board(8);
	System.out.println(b);
	//System.out.println(b.addQueen(1,1));
		System.out.println(b.solve());
	System.out.println(b);
    }
}
