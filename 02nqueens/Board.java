public class Board{
    int[][] board;
    public board(int n){
	board = new int[n][n];
	for(int i = 0; i < board.length;i++){
	    for(int k = 0; k < board[i].length; k++){
		board[i][k] = 0;
	    }
	}
    }
    public boolean solve(){
	
    }
    public void addQueen(int row, int col){
	board[row][col] = 1;
	for(int i = row + 1; i < board.length; i++){
	    board[i][col] -= 1;
	    if(col != 0){
		for(int k = col - 1; k > -1; k--){
		    board[i][k] -= 1;
		}
	    }
	    if(col != board.length - 1){
		for(int j = col + 1; j < board.length; j++){
		    board[i][j] -= 1;
		}
	    }
	}
    }
}
