// Last updated: 8/23/2025, 10:28:42 PM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(nums[n/2]-nums[i]);
        }
        return sum;
    }
    
}