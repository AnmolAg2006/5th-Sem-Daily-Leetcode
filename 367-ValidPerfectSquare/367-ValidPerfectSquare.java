// Last updated: 8/23/2025, 10:29:04 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.pow(num,0.5)!=(int)Math.pow(num,0.5))
        {
            return false;
        }
        return true;
    }
}