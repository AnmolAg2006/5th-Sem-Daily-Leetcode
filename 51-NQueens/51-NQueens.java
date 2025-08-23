// Last updated: 8/23/2025, 10:30:27 PM
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
    public static void nQueens(char board[][],int row,List<List<String>>ans)
    {
        if(row==board.length)
        {
            List<String>temp=new ArrayList<>();
            for(int i=0;i<board.length;i++)
            {
                StringBuilder s=new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    
                    s.append(board[i][j]);
                }
                temp.add(s.toString());
            }
            ans.add(temp);
            return ;
        }
        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board, row, i))
            {
                board[row][i]='Q';
                nQueens(board, row+1,ans);
                board[row][i]='.';
            }
        }   
    }
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='.';
            }
        }
        List<List<String>>ans=new ArrayList();
        nQueens(board, 0,ans );
        return ans;
    }
}