// Last updated: 8/23/2025, 10:26:23 PM
class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                c++;
            }
            else if (nums[i]==0)
            {
                return 0;
            }
        }
        return (c%2==0)?(1):-1;
    }
}