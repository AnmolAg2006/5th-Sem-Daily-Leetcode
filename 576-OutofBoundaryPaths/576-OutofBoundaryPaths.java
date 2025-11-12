// Last updated: 11/12/2025, 10:37:48 AM
class Solution {
    static final int MOD = 1_000_000_007;

    private int findPath(int m, int n, int maxMove, int r, int c, int[][][] dp) {
        if (r < 0 || c < 0 || r >= m || c >= n) return 1;
        if (maxMove == 0) return 0;
        if (dp[r][c][maxMove] != -1) return dp[r][c][maxMove];

        long paths = 0;
        paths += findPath(m, n, maxMove - 1, r - 1, c, dp);
        paths += findPath(m, n, maxMove - 1, r + 1, c, dp);
        paths += findPath(m, n, maxMove - 1, r, c - 1, dp);
        paths += findPath(m, n, maxMove - 1, r, c + 1, dp);

        dp[r][c][maxMove] = (int) (paths % MOD);
        return dp[r][c][maxMove];
    }

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
        for (int[][] grid : dp)
            for (int[] row : grid)
                Arrays.fill(row, -1);

        return findPath(m, n, maxMove, startRow, startColumn, dp);
    }
}
