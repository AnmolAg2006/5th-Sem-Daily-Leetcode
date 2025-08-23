// Last updated: 8/23/2025, 10:28:39 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ctr=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            ctr++;
            else{
                ctr=0;
            }
            max=Math.max(ctr,max);
        }
        return max;
    }
}