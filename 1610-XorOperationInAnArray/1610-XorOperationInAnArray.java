// Last updated: 8/23/2025, 10:26:57 PM
class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int[n];
        int ans=0;
        while(n!=0)
        {
            ans^=start;
            start+=2;
            n--;
        }
        return ans;
    }
}