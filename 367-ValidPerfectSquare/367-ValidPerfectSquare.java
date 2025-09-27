// Last updated: 9/27/2025, 5:00:16 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.pow(num,0.5)!=(int)Math.pow(num,0.5))
        {
            return false;
        }
        return true;
    }
}