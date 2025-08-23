// Last updated: 8/23/2025, 10:25:15 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
            int num = nums[i];
            while (num > 0) {
                s2 += num % 10; // Add the last digit
                num /= 10;       // Remove the last digit
            }
        }
        return s1-s2;
    }
}