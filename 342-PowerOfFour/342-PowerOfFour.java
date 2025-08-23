// Last updated: 8/23/2025, 10:29:11 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(Math.log(n)/Math.log(4)==(int)(Math.log(n)/Math.log(4)))
        {
            return true;
        }
        return false;
    }
}