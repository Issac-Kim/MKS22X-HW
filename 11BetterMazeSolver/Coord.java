import java.util.*;
public class Coord{
    int[] coor = new int[2];
    ArrayList<Integer> path = new ArrayList<Integer>();
    public Coord(int r, int c, ArrayList<Integer> path){
	coor[0] = r;
	coor[1] = c;
	this.path = path;
	path.add(r);
	path.add(c);
    }
}
