// Last updated: 10/6/2025, 7:02:04 PM
class Solution {
    public static int perm(int m, int n, int i, int j, int dp[][]) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i == m || j == n) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = perm(m, n, i + 1, j,dp) + perm(m, n, i, j + 1,dp);

    }

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return perm(m, n, 0, 0 ,dp);
    }
}