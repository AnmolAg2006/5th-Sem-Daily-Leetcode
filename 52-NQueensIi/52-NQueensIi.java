// Last updated: 8/23/2025, 10:30:26 PM
class Solution {
    public static boolean isSafe(char board[][],int row,int col)
    {
        for (int i = row; i >=0; i--){
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        for (int i = row-1,j=col-1; i >=0 && j>=0; i--,j--) {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        for (int i = row-1,j=col+1; i >=0 && j<board.length; i--,j++) {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    static int c=0;
    public static void print(char arr[][],int row)
    {
        if(row==arr.length)
        {
            c++;
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(isSafe(arr,row,i))
            {
                arr[row][i]='Q';
                print(arr, row+1);
                arr[row][i]='.';
            }
        }
        return ;
    }
    public int totalNQueens(int n) {
        char arr[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        print(arr,0);
        int ans=c;
        c=0;
        return ans;
    }
}