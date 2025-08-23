// Last updated: 8/23/2025, 10:23:59 PM
class Solution {
        public int smallestNumber(int n) {
        int res = 1;
        while (res < n)
            res = res * 2 + 1;
        return res;
    }
}