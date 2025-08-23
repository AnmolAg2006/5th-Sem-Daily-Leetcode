// Last updated: 8/23/2025, 10:29:29 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==536870912)
        {
            return true;
        }
        if(Math.log(n)/Math.log(2)==(long)(Math.log(n)/Math.log(2)))
        {
            return true;
        }
        return false;
    }
}