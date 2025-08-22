// Last updated: 8/22/2025, 8:09:18 AM
class Solution {
    public int minimumArea(int[][] grid) {
        int maxi=-1;
        int maxj=-1;
        int mini=grid.length;
        int minj=grid[0].length;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    mini=Math.min(mini,i);
                    minj=Math.min(minj,j);
                    maxi=Math.max(maxi,i);
                    maxj=Math.max(maxj,j);
                }
            }
        }
        return (maxi-mini+1)*(maxj-minj+1);
    }
}