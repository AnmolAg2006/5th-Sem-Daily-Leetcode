// Last updated: 8/23/2025, 10:24:12 PM
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        if(((int)coordinate1.charAt(0)+(int)(coordinate1.charAt(1))+((int)coordinate2.charAt(0)+(int)(coordinate2.charAt(1))))%2==0)
        {
            return true;
        }
        return false;
    }
}