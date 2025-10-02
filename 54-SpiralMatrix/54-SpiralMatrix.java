// Last updated: 10/2/2025, 1:46:41 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int minr = 0;
        int maxr = n - 1;
        int minc = 0;
        int maxc = m - 1;
        while (minc <= maxc && minr <= maxr) {
            for (int i = minc; i <= maxc; i++) {
                ans.add(matrix[minr][i]);
            }
            minr++;

            for (int i = minr; i <= maxr; i++) {
                ans.add(matrix[i][maxc]);
            }
            maxc--;
            if (minr <= maxr) {
                for (int i = maxc; i >= minc; i--) {
                    ans.add(matrix[maxr][i]);
                }
                maxr--;
            }
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    ans.add(matrix[i][minc]);
                }
                minc++;
            }
        }
        return ans;
    }
}