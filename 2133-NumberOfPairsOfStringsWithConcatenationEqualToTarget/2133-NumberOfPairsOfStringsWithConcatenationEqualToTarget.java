// Last updated: 8/23/2025, 10:26:07 PM
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if((nums[i]+nums[j]).equals(target))
                {
                    c++;
                }
            }
        }
        return c;
    }
}