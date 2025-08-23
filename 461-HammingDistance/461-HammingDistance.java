// Last updated: 8/23/2025, 10:28:43 PM
class Solution {
        public static int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    
}
    public int hammingDistance(int x, int y) {
        int z=x ^ y;
        return hammingWeight(z);
    }
}