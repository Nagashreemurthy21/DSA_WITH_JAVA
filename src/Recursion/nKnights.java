package DSA;

public class nKnights {

	public static void main(String[] args) {
		int n=4;
		boolean[][]board=new boolean[n][n];
		int ans=nKnights(board,0,0,4);
		System.out.println(ans);
	}
	public static int nKnights(boolean[][]board, int row, int col, int knights)
	{
		if(row==board.length)
		{
			return 0;
		}
		int count=0;
		if(knights==0)
		{
			display(board);
			return 1;
		}
		if(col==board.length)
		{
			return nKnights(board,row+1,0,knights);
			
		}
		if(isSafe(board,row,col))
		{
			board[row][col]=true;
			count+=nKnights(board,row,col+1,knights-1);
			board[row][col]=false;
		}
		count+=nKnights(board,row,col+1,knights);
		return count;
	}
	public static void display(boolean[][]board)
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j])
				{
					System.out.print("K ");
				}
				else
				{
					System.out.print("X ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	public static boolean isValid(boolean[][]board, int row, int col)
	{
		if(row>=0 && row<board.length && col>=0 && col<board.length)
		{
			return true;
		}
		return false;
	}
	public static boolean isSafe(boolean[][]board, int row, int col)
	{
		if(isValid(board,row-2,col+1) && board[row-2][col+1])
	        return false;

	    if(isValid(board,row-2,col-1) && board[row-2][col-1])
	        return false;

	    if(isValid(board,row-1,col+2) && board[row-1][col+2])
	        return false;

	    if(isValid(board,row-1,col-2) && board[row-1][col-2])
	        return false;
		return true;
	}
}
