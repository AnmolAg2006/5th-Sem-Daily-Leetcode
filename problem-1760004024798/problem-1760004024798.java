// Last updated: 10/9/2025, 3:30:24 PM
class Solution {
    private int atMost(int[] nums, int k) {

        int l = 0;
        int c = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 1) {
                k--;
                while (k < 0) {
                    if(nums[l]%2==1)
                    {
                        k++;
                    }
                l++;
                }
                
            }
            c+=r-l+1;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}