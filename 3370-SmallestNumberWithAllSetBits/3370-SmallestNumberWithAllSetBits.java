// Last updated: 10/29/2025, 7:27:21 AM
class Solution {
        public int smallestNumber(int n) {
        int res = 1;
        while (res < n)
            res = res * 2 + 1;
        return res;
    }
}