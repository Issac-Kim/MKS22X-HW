public class Board{
    int[][] board;
    public Board(int n){
	board = new int[n][n];
	for(int i = 0; i < board.length;i++){
	    for(int k = 0; k < board[i].length; k++){
		board[i][k] = 0;
	    }
	}
    }
    public boolean solve(){
	return solveH(0);
    }
    public boolean solveH(int row){
	for(int c = 0; c < board.length; c++){
	    if(board[board.length-1][c] == 1){
		return true;
	    }
	}
	for(int c = 0; c < board.length; c++){
	    System.out.println(toString());
	    if(addQueen(row,c)){
		solveH(row + 1);
	    }
	    else{
		removeQueen(row,c);
	    }
	}
	return false;
    }
    public boolean addQueen(int row, int col){
	if(board[row][col]!= 0){
	    return false;
	}
	board[row][col] = 1;
	for(int i = row + 1; i < board.length; i++){
	    board[i][col]--;
	    if(col-(i-row-1) > 0){	
		board[i][col-(i-row)]--;
	    }
	    if(col+(i-row-1) < board.length - 1){
		board[i][col+(i-row)]--;
	    }
	}
	return true;
    }
    public boolean removeQueen(int row, int col){
	if(board[row][col]!= 1){
	    return false;
	}
	board[row][col] = 0;
	for(int i = row + 1; i < board.length; i++){
	    board[i][col]++;
	    if(col-(i-row-1) > 0){	
		board[i][col-(i-row)]++;
	    }
	    if(col+(i-row-1) < board.length - 1){
		board[i][col+(i-row)]++;
	    }
	}
	return true;
    }
    public String toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c] + "\t";
	    }
	    ans+="\n";
	}
	return ans;
    }
}
    
    
