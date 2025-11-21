// Last updated: 11/21/2025, 12:15:12 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int mini = 0;
        int minj = 0;
        int maxi = matrix.length-1;
        int maxj = matrix[0].length-1;
        int c=0;
        int total=matrix.length*matrix[0].length;
        while (c<total) {
            for (int j = minj; j <= maxj; j++) {
                ans.add(matrix[mini][j]);
                c++;
            }
            mini++;
            if(c>=total){
                break;
            }
            for (int i = mini; i <= maxi; i++) {
                ans.add(matrix[i][maxj]);
                c++;
            }
            maxj--;
            if(c>=total){
                break;
            }
            for (int j = maxj ; j >= minj; j--) {
                ans.add(matrix[maxi][j]);
                c++;
            }
            maxi--;
            if(c>=total){
                break;
            }
            for (int j = maxi; j >= mini; j--) {
                ans.add(matrix[j][minj]);
                c++;
            }
            minj++;
            if(c>=total){
                break;
            }
        }
        return ans;
    }
}