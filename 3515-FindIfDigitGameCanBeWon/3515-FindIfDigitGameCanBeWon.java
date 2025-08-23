// Last updated: 8/23/2025, 10:24:17 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0;
        int d=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                s+=nums[i];
            }
            else{
                d+=nums[i];
            }
        }
        return !(s==d);
    }
}