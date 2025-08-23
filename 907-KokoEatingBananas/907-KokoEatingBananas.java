// Last updated: 8/23/2025, 10:27:49 PM
class Solution {
    public boolean isPossible(int piles[], int mid, int h) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] + mid - 1) / mid;
        }
        return hours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = Arrays.stream(piles).max().getAsInt();

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (isPossible(piles, mid, h)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
