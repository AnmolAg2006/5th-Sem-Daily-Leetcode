// Last updated: 8/23/2025, 10:26:26 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(((int)(coordinates.charAt(0))+(int)(coordinates.charAt(1)))%2!=0)
        {
            return true;
        }
        return false;
    }
}