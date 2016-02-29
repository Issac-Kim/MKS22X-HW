public class KnightBoard{
    int[][] board;
    int size;
    public KnightBoard(int n){
	this(n,n);
    }
    public KnightBoard(int m, int n){
	board = new int[m+4][n+4];
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		if(r < 2 || r > board.length - 3 || c < 2 || c >board[0].length -3){
		    board[r][c] = -1;
		}
		else{
		    board[r][c] = 0;
		}
	    }
	}
	size = m * n;
	System.out.println(board.length + "," + board[0].length);
    }
    public boolean solve(){
	//moveKnight(2,2,1);
	return solveH(2,2,1);
    }
    /*public boolean solveH(int row, int col, int n, int d){
	//	printSolution();
	for(int i = d; i < 9; i++){
	    
	    	    if(n > size){
		return true;
	    }
	    if(i == 8){
		return false;
		}
	    int[] move = getMove(i);
	    if(moveKnight(row, col, n)){
		if(n == size){
		    return true;
		}
		else{
		    if(solveH(row + move[0], col + move[1], n + 1, 0)){
			return true;
		    }
		    else{
		       	removeKnight(row, col, n);
		      	return solveH(row, col, n, i + 1);
		    }
		}
	    }
	   
	}
	return false;
	}*/
    public boolean solveH(int r, int c, int n){
	//	printSolution();
	if(moveKnight(r,c,n)){
	    if(n==size){
		return true;
	    }
	    if(solveH(r+2,c+1,n+1)||solveH(r-2,c+1,n+1)||solveH(r+2,c-1,n+1)||solveH(r-2,c-1,n+1)||solveH(r+1,c+2,n+1)||solveH(r-1,c+2,n+1)||solveH(r+1,c-2,n+1)||solveH(r-1,c-2,n+1)){
		return true;
	    }
	    else{
		removeKnight(r,c,n);
	    }
	}
	return false;
    }
    
    public int[] getMove(int d){
	int[] move;
	if(d == 0){
	    move = new int[]{1,2};
	}
	else if(d == 1){
	    move = new int[]{2,1};
	}
	else if(d == 2){
	    move = new int[]{-1,2};
	}
	else if(d == 3){
	    move = new int[]{-2,1};
	}
	else if(d == 4){
	    move = new int[]{-1,-2};
	}
	else if(d == 5){
	    move = new int[]{-2,-1};
	}
	else if(d == 6){
	    move = new int[]{1,-2};
	}
	else{
	    move = new int[]{2,-1};
	}
	return move;
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
    public int removeKnight(int r, int c, int n){
	int temp = board[r][c];
	board[r][c] -= n;
	return temp;
    }
    public void printSolution(){
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		if(board[r][c] >= 0){
		    System.out.print("\t"+ board[r][c]);
		}
		
	    }
	    System.out.println("");
	}
    }
    public String toString(){
	String ans = "";
	for(int r = 0; r < board.length; r++){
	    for(int c = 0; c < board[0].length; c++){
		ans+= board[r][c] + "\t";
	    }
	    ans += "\n";
	}
	return ans;
    }
    
}
