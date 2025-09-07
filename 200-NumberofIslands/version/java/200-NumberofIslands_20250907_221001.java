// Last updated: 9/7/2025, 10:10:01 PM
class Solution {
   public static void fun(char grid[][], int i, int j, boolean isVis[][]) {
    // boundary check + water check + visited check
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || 
        grid[i][j] == '0' || isVis[i][j]) {
        return;
    }

    isVis[i][j] = true;

    // Explore all 4 directions
    fun(grid, i + 1, j, isVis); // down
    fun(grid, i - 1, j, isVis); // up
    fun(grid, i, j + 1, isVis); // right
    fun(grid, i, j - 1, isVis); // left
}

    public int numIslands(char[][] grid) {
        boolean isVis[][] = new boolean[grid.length][grid[0].length];
        int c=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1' && !isVis[i][j])
                {
                    fun(grid,i,j,isVis);
                    c++;
                }
            }
        }
        return c;
    }
}