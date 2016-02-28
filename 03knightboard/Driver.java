public class Driver{
    public static void main(String[] args){
	KnightBoard b = new KnightBoard(5,6);
	System.out.println(b);
	System.out.println(b.solve()) ;
	b.printSolution();
    }
}
