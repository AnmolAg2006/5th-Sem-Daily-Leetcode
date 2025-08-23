// Last updated: 8/23/2025, 10:26:48 PM
class Solution {
    public int maxCoins(int[] piles) {
        int max = 0;
        Arrays.sort(piles);
        int i = 0; 
        int j = piles.length-2;
        while(i < j) {
            max += piles[j];
            i++;
            j-=2;
        }
        return max;
    }
}