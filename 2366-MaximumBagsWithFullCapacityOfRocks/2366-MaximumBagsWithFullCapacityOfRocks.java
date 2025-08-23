// Last updated: 8/23/2025, 10:25:40 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int ar) {
        int c=0;
        for(int i=0;i<rocks.length;i++) rocks[i]=capacity[i]-rocks[i];
        Arrays.sort(rocks);
        for(int i=0;i<rocks.length && (rocks[i]-ar)<=0;i++) {
            c++;
            ar-=rocks[i];
        }
        return c;
    }
}