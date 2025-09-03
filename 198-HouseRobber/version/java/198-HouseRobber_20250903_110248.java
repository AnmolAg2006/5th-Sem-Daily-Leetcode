// Last updated: 9/3/2025, 11:02:48 AM
class Solution {
    public static int fun(int nums[],int vis[],int i) {
        if(i==nums.length||i==nums.length+1)
        {
            return 0;
        }
        if(vis[i]!=-1)
        {
            return vis[i];
        }
        vis[i]=Math.max(fun(nums,vis,i+2)+nums[i],fun(nums,vis,i+1));
        return vis[i];
    }
    public int rob(int[] nums) {
        int vis[]=new int[nums.length];
        Arrays.fill(vis,-1);
        return fun(nums,vis,0);
    }
}