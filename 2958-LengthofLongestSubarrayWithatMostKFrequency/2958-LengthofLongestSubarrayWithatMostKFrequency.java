// Last updated: 10/11/2025, 10:51:17 PM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=0;
        int l=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int r=0;r<nums.length;r++)
        {
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            if(hm.get(nums[r])>k)
            {
                ans=Math.max(ans,r-l);
                while(nums[l]!=nums[r])
                {
                    hm.put(nums[l],hm.get(nums[l])-1);
                    l++;
                }
                hm.put(nums[l],hm.get(nums[l])-1);
                l++;
            }
            
        }
        ans=Math.max(ans,nums.length-l);
        System.out.print(hm);
        return ans;
    }
}