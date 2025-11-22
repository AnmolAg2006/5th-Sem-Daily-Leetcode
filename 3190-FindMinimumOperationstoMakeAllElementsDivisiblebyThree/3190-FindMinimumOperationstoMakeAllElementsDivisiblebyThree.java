// Last updated: 11/22/2025, 12:53:36 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0)
            {
                c+=1;
            }
        }
        return c;
    }
}