// Last updated: 10/21/2025, 10:03:32 PM
class Solution {
    public static int dfs(int grid[][], boolean vis[][], int i, int j) {
        if (i == grid.length || j == grid[0].length || i == -1 || j == -1 || vis[i][j] || grid[i][j]==0) {
            return 0;
        }
        vis[i][j] = true;
        int l = dfs(grid, vis, i + 1, j);
        int r = dfs(grid, vis, i, j + 1);
        int u = dfs(grid, vis, i - 1, j);
        int d = dfs(grid, vis, i, j - 1);
        return l + r + u + d + 1;
    }

    public int maxAreaOfIsland(int[][] grid) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j]==1) {
                    ans = Math.max(ans, dfs(grid, vis, i, j));
                    System.out.println(i+" "+j);
                }
            }
        }
        return ans;
    }
}