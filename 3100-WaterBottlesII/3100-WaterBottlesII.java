// Last updated: 10/2/2025, 10:55:52 AM
class Solution {
    public int maxBottlesDrunk(int full, int val) {
        int bottle=full;
        int ans = full;
        while (bottle >= val) {
            bottle -= val;
            ans ++;
            val++;
            bottle++;
        }
        return ans;
    }
}