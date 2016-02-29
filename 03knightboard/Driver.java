public class Driver{
    public static void main(String[] args){
	KnightBoard b = new KnightBoard(7,8);
	System.out.println(b);
	System.out.println(b.solve()) ;
	b.printSolution();
    }
}
