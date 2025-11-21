// Last updated: 11/21/2025, 12:28:56 PM
class Solution {
    public static int fun(int grid[][],int r,int c)
    {
        if(r+2>=grid.length  || c+2>=grid[0].length) return 0;
        int sum=0;
        for(int i=c;i<=c+2;i++)
        {
            sum+=grid[r][i];
            sum+=grid[r+2][i];
        }
        System.out.print(sum+grid[r+1][c+1]+" ");
        return sum+grid[r+1][c+1];
    }
    public int maxSum(int[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<m-2;j++)
            {
                ans=Math.max(ans,fun(grid,i,j));
            }
        }
        return ans;
    }
}