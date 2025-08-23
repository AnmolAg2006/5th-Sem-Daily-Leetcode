// Last updated: 8/23/2025, 10:26:55 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            
        
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
        
    }
}