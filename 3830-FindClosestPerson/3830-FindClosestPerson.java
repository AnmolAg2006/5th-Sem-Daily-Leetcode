// Last updated: 8/23/2025, 10:23:45 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)==Math.abs(y-z))
        {
            return 0;
        }
        return (Math.abs(z-x)>Math.abs(y-z))?2:1;
    }
}