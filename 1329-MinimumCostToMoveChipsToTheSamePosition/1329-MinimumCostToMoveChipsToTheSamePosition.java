// Last updated: 8/23/2025, 10:27:27 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int o=0;
        for(int i:position)
        {
            if(i%2!=0)
            {
                o++;
            }
        }
        return Math.min(o,position.length-o);
    }
}