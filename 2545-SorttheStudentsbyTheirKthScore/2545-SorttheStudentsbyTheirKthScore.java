// Last updated: 10/22/2025, 1:00:34 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->b[k]-a[k]);
        return score;
    }
}