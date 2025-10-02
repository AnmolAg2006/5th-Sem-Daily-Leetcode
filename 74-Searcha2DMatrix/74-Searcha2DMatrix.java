// Last updated: 10/2/2025, 1:14:12 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid =  lo + (hi - lo) / 2;
            if (matrix[mid][0] > target) {
                hi = mid - 1;
            } else if (matrix[mid][0] < target) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        if(hi<0) return false;
        int row = hi;
        lo=0;
        hi=m-1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (matrix[row][mid] > target) {
                hi = mid - 1;
            } else if (matrix[row][mid] < target) {
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}