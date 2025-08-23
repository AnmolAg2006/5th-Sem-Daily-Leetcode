// Last updated: 8/23/2025, 10:29:25 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while( i<matrix.length && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            if(matrix[i][j]>target)
            {
                j--;
            }
            
            else{
                i++;
            }
        }
        return false;
    }
}