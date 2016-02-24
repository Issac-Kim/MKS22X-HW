import java.io.*;
import java.util.*;

public class Bronze{
    public static void main(String[] args){
	int row;
	int col;
	int depth;
	int stomps;
	try{
	    File f = new File("makelake.in");
	    Scanner lines = new Scanner(f);
	    Scanner info = new Scanner(lines.nextLine());
	    row = info.nextInt();
	    col = info.nextInt();
	    depth = info.nextInt();
	    stomps = info.nextInt();
	    int[][] land = new int[row][col];
	    for(int r = 0; r < row; r++){
		Scanner vals = new Scanner(lines.nextLine());
		for(int c = 0; c < col; c++){
		    land[r][c] = vals.nextInt();
		}
	    }
	    for(int i = 0; i < row; i++){
		for(int j = 0; j < col; j++){
		    System.out.print(land[i][j] + " ");
		}
		System.out.println("");
	    }
	}catch(FileNotFoundException e){
	    System.out.println("no file found");
	}
	
    }
}
