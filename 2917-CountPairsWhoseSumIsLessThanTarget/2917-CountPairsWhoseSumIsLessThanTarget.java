// Last updated: 8/23/2025, 10:24:49 PM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums.get(i) + nums.get(j) < target)
                {
                    c++;
                }
            }
        }
        return c;
    }
}