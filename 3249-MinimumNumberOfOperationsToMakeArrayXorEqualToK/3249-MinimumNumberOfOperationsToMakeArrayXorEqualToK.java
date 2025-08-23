// Last updated: 8/23/2025, 10:24:38 PM
class Solution {
    private int bitcount(int diff) {
         int count = 0 ; 
          while(diff != 0 ){
             count  +=  diff & 1;
             diff >>= 1;
          }
           return count;
    }
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans^=nums[i];
        }
        ans=ans^k;
        return bitcount(ans);
    }
}