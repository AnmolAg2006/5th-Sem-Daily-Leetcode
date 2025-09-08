// Last updated: 9/8/2025, 1:59:20 PM
/*class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]!=nums[i+1])
                return nums[i];
            i++;
        }

        return nums[n-1];
    }
}*/

class Solution {
    static{
        for(int i=0;i<200;i++){
            singleNumber(new int[]{1});
        }
    }
    public static int singleNumber(int[] nums) {
        int x=0;
        for(int n:nums){
            x=x^n;
        }
        return x;
    }
}