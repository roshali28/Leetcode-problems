import java.util.*;
public class Largest_local_value_matrix {
public static int[][] largestLocal(int[][] grid) {
	int n = grid.length;
	int ans[][] = new int[n-2][n-2];
	for(int i=0;i<n-2;i++) {
		for(int j=0;j<n-2;j++) {
			for(int x=i;x<i+3;x++) {
				for(int y=j;y<j+3;y++)
					ans[i][j] = Math.max(ans[i][j],grid[x][y]);
			}
		}
	}
	System.out.println(Arrays.deepToString(ans));
	return ans;
}
	public static void main(String[] args) {
	int grid[][]= {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};	
	largestLocal(grid);
	
	}

}
