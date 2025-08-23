// Last updated: 8/23/2025, 10:25:05 PM
class Solution {
    public int matrixSum(int[][] nums) {
        int score=0;
        int n=nums.length;
        int m=nums[0].length;
        for(int i=0;i<n;i++)
        {
            Arrays.sort(nums[i]);
        }
        for(int i=0;i<m;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                max=Math.max(max,nums[j][i]);
            }
            score+=max;
        }
        return score;
    }
}