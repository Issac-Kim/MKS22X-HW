import java.util.*;
import java.file.*;

public class Silver{
  public static void main(String[] args){
	int row;
	int col;
	int steps;
	int sum = 0;
	try{
	    File f = new File("makelake.in");
	    Scanner lines = new Scanner(f);
	    Scanner info = new Scanner(lines.nextLine());
	    row = info.nextInt();
	    col = info.nextInt();
	    steps = info.nextInt();
	    char[][] land = new char[row][col];
	    for(int r = 0; r < row; r++){
		String vals = lines.nextLine();
		for(int c = 0; c < col; c++){
		    land[r][c] = vals.substring(c, c+1);
		}
	    }
	    Scanner coord = new Scanner(lines.nextLine());	
	    int r1 = coord.nextInt();
	    int c1 = coord.nextInt();
	    int r2 = coord.nextInt();
	    int c2 = coord.nextInt();
	    
	    System.out.println(sum + ",6,Kim,Issac");
	}catch(FileNotFoundException e){
	    System.out.println("no file found");
	}
	
    }
}
