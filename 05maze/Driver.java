public class Driver{

    public static void main(String[]args){
        Maze f;
        f = new Maze("data3.dat",false);//true animates the maze.
        f.printMaze();
	
        f.clearTerminal();
        System.out.println(f.solve());

        f.clearTerminal();
        System.out.println(f);
    }
}
