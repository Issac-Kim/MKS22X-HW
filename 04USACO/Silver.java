import java.util.*;
import java.io.*;

public class Silver{
    public static void takeStep(int r, int c, int[][] arr, int n){
	//System.out.println(n);
	if(arr[r][c] != -1){
	    if(r > 0){
		arr[r-1][c] += n;
	    }
	    if(r < arr.length - 1){
		arr[r+1][c] += n;
	    }
	    if(c > 0){
		arr[r][c-1] += n;
	    }
	    if(c < arr[0].length - 1){
		arr[r][c+1] += n;
	    }
	}
    }
    public static void main(String[] args){
	int row;
	int col;
	int steps;
	try{
	    File f = new File("ctravel.in");
	    Scanner lines = new Scanner(f);
	    Scanner info = new Scanner(lines.nextLine());
	    row = info.nextInt();
	    col = info.nextInt();
	    steps = info.nextInt();
	    //System.out.println(row+","+col);
	    int[][] land1 = new int[row][col];
	    int[][] land2 = new int[row][col];
	    for(int r = 0; r < row; r++){
		String vals = lines.nextLine();
		//	System.out.println(vals);
		for(int c = 0; c < col; c++){
		    if(vals.charAt(c) == '.'){
			land1[r][c] = 0;
			land2[r][c] = 0;
		    }
		    else{
			land1[r][c] = -1;
			land2[r][c] = -1;
		    }
		}
	    }
	    Scanner coord = new Scanner(lines.nextLine());
	    int r1 = coord.nextInt()-1;
	    int c1 = coord.nextInt()-1;
	    int r2 = coord.nextInt()-1;
	    int c2 = coord.nextInt()-1;
	    //System.out.println(r1+","+c1+","+r2+","+c2);
	    /* for(int r = 0; r < row; r++){
		for(int c = 0; c < col; c++){
		    System.out.print(land1[r][c] + " ");
		}
		System.out.println();
	    }
	    for(int r = 0; r < row; r++){
		for(int c = 0; c < col; c++){
		    System.out.print(land2[r][c] + " ");
		}
		System.out.println();
		}*/
	    land1[r1][c1] = 1;
	    for(int i = 0; i < steps; i++){
		if(i%2 == 1){
		    for(int r = 0; r < row; r++){
			for(int c = 0; c < row; c++){
			    if(land2[r][c] > 0){
				takeStep(r,c,land1,land2[r][c]);
				land2[r][c] = 0;
			    }
			    // System.out.println(land2[r2][c2]);
			}
		    }
		}
		else{
		    for(int r = 0; r < row; r++){
			for(int c = 0; c < row; c++){
			    if(land1[r][c] > 0){
				takeStep(r,c,land2,land1[r][c]);
				land1[r][c] = 0;
			    }
			    //System.out.println(land1[r2][c2]);
			}
		    }
		}
	    }
		    
	    System.out.println(land1[r2][c2] + land2[r2][c2] + ",6,Kim,Issac");
	}catch(FileNotFoundException e){
	    System.out.println("no file found");
	}
	
    }
}
