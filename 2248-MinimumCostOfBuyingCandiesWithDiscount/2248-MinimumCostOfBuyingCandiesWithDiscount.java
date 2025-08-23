// Last updated: 8/23/2025, 10:25:53 PM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        int c=1;
        for(int i=cost.length-1;i>=0;i--)
        {
            if(c++%3!=0)
            {
                // continue;
                ans+=cost[i];
            }

        }
        return ans;
    }
}