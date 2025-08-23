// Last updated: 8/23/2025, 10:29:56 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int l=cost.length;
        for (int i = 0; i < l; i++) {
            total+=gas[i]-cost[i];
        }
        if(total<0)
        {
            return -1;
        }
        int idx=0;
        int curr=0;
        for (int i = 0; i < l; i++) {
            curr+=gas[i]-cost[i];
            if(curr<0)
            {
                curr=0;
                idx=i+1;
            }
        }
        
        return idx;
    }
    
}