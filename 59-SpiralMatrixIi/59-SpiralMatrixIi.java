// Last updated: 8/23/2025, 10:30:23 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        int val = 1;

        while (startRow <= endRow && startCol <= endCol) {

            // first fill row
            for (int j = startCol; j <= endCol; j++) {
                 matrix[startRow][j] = val;
                 val += 1; 
            
            }
            startRow++;

            // fill end col
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endCol] = val;
                val += 1; 
            }
            endCol--;

            // fill last row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    matrix[endRow][j] = val;
                    val += 1;
                }
                endRow--;
            }

            // fill first col
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startCol] = val;
                     val += 1;
                }
                startCol++;
            }
        }
        return matrix;
    }
}