// Last updated: 8/23/2025, 10:26:50 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i==n-1-j)
                {
                    ans+=mat[i][j];
                }
            }
        }
        return ans;
    }
}