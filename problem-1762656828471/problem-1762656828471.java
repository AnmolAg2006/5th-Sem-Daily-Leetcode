// Last updated: 11/9/2025, 8:23:48 AM
class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>arr[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
            {
                arr[i]=new ArrayList<>();
            }
        for(int i=0;i<n;i++)
            {
                arr[nums[i]].add(i);
            }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++)
            {
                if(arr[i].size()>2)
                {
                    for(int j=0;j<arr[i].size()-2;j++)
                        {
                            ans=Math.min(2*(arr[i].get(j+2)-arr[i].get(j)),ans);
                        }
                }
            }
        if(ans==Integer.MAX_VALUE) return -1;
        else return ans;
    }
}