// Last updated: 8/23/2025, 10:27:56 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(m+1)/2;j++)
            {
                int temp=arr[i][j]^1;
                arr[i][j]=arr[i][m-j-1]^1;
                arr[i][m-j-1]=temp;
            }
        }
        return arr;
    }
}