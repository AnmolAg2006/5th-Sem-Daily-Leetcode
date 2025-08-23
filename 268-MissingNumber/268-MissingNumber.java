// Last updated: 8/23/2025, 10:29:19 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int arraySum=0;

        for(int i=0;i<n;i++){
            arraySum+=nums[i];

        }

        return sum-arraySum;
    }
}