// Last updated: 8/23/2025, 10:25:22 PM
class Solution {
    public int pivotInteger(int n) {
        int s = (n * n + n) / 2;
        
        double x = Math.sqrt(s);
        
        if (x == (int) x) {
            return (int) x;
        }
        
        return -1;
    }
}