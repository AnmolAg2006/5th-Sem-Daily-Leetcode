// Last updated: 8/23/2025, 10:24:43 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        return n*(n+1)/2-m*(n/m*(n/m+1)/2)*2;
    }
}