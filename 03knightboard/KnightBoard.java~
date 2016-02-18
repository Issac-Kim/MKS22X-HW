public class KnightBoard{
    int[][] board;
    public KnightBoard(int n){
	board = new int[n+4][n+4];
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board.length; c++){
		if(r < 2 || r > board.length - 3 || c < 2 || c >board.length -3){
		    board[r][c] = -1;
		}
		else{
		    board[r][c] = 0;
		}
	    }
	}
    }
    public void printSolution(){
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board.length; c++){
		if(board[r][c] >= 0){
		    System.out.print(board[r][c]);
		}
	
	    }
	    System.out.println("");
	}
    }
    public String toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board.length; c++){
		ans+= board[r][c] + "\t";
	    }
	    ans += "\n";
	}
	return ans;
    }
    
}
