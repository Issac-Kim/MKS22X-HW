public class KnightBoard{
    int[][] board;
    int size;
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
	size = n * n;
    }
    public void solve(){
	solveH(board.length/2,board.length/2, 1);
    }
    public boolean solveH(int row, int col, int n){
	if(moveKnight(row+2,col+1,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row+2,col+1,n++)){
		return true;
	    }
	    else{
		removeKnight(row+2,col+1);
	    }
	}
	if(moveKnight(row+2,col-1,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row+2,col-1,n++)){
		return true;
	    }
	    else{
		removeKnight(row+2,col-1);
	    }
	}
	if(moveKnight(row-2,col+1,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row-2,col+1,n++)){
		return true;
	    }
	    else{
		removeKnight(row-2,col+1);
	    }
	}
	if(moveKnight(row-2,col-1,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row-2,col-1,n++)){
		return true;
	    }
	    else{
		removeKnight(row-2,col-1);
	    }
	}
	if(moveKnight(row+1,col+2,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row+2,col+2,n++)){
		return true;
	    }
	    else{
		removeKnight(row+1,col+2);
	    }
	}
	if(moveKnight(row-1,col+2,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row-1,col+2,n++)){
		return true;
	    }
	    else{
		removeKnight(row-1,col+2);
	    }
	}
	if(moveKnight(row+1,col-2,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row+1,col-2,n++)){
		return true;
	    }
	    else{
		removeKnight(row+1,col-2);
	    }
	}
	if(moveKnight(row-1,col-2,n)){
	    if(n == size){
		return true;
	    }
	    if(solveH(row-1,col-2,n++)){
		return true;
	    }
	    else{
		removeKnight(row-1,col-2);
	    }
	}
	else{
	    return false;
	}

    }
    
    public boolean moveKnight(int r, int c, int n){
	if(board[r][c] != 0){
	    return false;
	}
	else{
	    board[r][c] = n;
	    return true;
	}
    }
    public int removeKnight(int r, int c){
	int temp = board[r][c];
	board[r][c] = 0;
	return temp;
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
