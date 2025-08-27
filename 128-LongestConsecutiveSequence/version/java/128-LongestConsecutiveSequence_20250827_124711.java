// Last updated: 8/27/2025, 12:47:11 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        HashSet<Integer>ts=new HashSet<>();
        for(int i:nums)
        {
            ts.add(i);
        }
        int ans=1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(!ts.contains(nums[i]-1))
            {
                int c=0;
                while(i<nums.length && ts.contains(nums[i]))
                {
                    ts.remove(nums[i]);
                    c++;
                    nums[i]++;
                }
                ans=Math.max(ans,c);    
            }
        }
        return ans;
    }
}