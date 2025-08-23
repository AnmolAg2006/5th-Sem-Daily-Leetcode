// Last updated: 8/23/2025, 10:23:49 PM
class Solution {
    public int[] minCosts(int[] cost) {
        int min=cost[0];
        for(int i=1;i<cost.length;i++)
        {
            if(min>cost[i])
            {
                min=cost[i];
            }
            cost[i]=min;
        }
        return cost;
    }
}