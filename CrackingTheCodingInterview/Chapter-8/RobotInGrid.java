/*
Similar Question:  https://www.youtube.com/watch?v=P8Xa2BitN3I&t=12s
*/

public class RobotInGrid{
	
	int pathRecursive(int[][] grid, int row, int col){
		if(!isValid(grid,row,col)) return 0;
		if(isEnd(grid,row,col)) return 1;
		return pathRecursive(grid,row+1,col) + path(grid,row,col+1);
	}


	// Using Dynamic Programming and Memoization
	int pathDynamic(int[][] grid, int row, int col, int[][] memo){
		if(!isValid(grid,row,col)) return 0;
		if(isEnd(grid,row,col)) return 1;
		
		if(memo[row][col]==0){
			memo[row][col] = pathRecursive(grid,row+1,col,memo) + pathRecursive(grid,row,col+1,memo);
		}

		return memo[row][col];
	}

	public static void main(String[] args) {
		
	}
}