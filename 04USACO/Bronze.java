import java.io.*;
import java.util.*;

public class Bronze{
    public static void main(String[] args){
	int row;
	int col;
	int depth;
	int stomps;
	int sum = 0;
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
	    for(int s = 0; s < stomps; s++){
		Scanner st = new Scanner(lines.nextLine());
		
		int r = st.nextInt() - 1;
		int c = st.nextInt() - 1;
		int d = st.nextInt();
	
		
		for(int j = 0; j < d; j++){
		    int max = 0;
		    for(int i = 0; i < 3; i++){
			for(int k = 0; k < 3; k++){
	
			    if(land[r + i][c + k] > max){
				max = land[r + i][c + k];
			    }
			}
		    }
		    for(int i = 0; i < 3; i++){
			for(int k = 0; k < 3; k++){
			    if(land[r + i][c + k] == max){
				land[r + i][c + k] -= 1;
			    }
			}
		    }
		}
	    }
	    for(int r = 0; r < row; r++){
		for(int c = 0; c < col; c++){
		    land[r][c] -= depth;
		    if(land[r][c] < 0){
			sum += land[r][c];
		    }
		}
	    }
	    sum = sum * 72 * -72;
	    System.out.println(sum + ",6,Kim,Issac");
	}catch(FileNotFoundException e){
	    System.out.println("no file found");
	}
	
    }
}
