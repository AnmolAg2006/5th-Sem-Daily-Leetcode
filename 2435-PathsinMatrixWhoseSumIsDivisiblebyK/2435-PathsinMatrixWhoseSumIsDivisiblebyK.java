// Last updated: 11/26/2025, 1:34:59 PM
class Solution {
    static int MOD=1000000007;
    public static int fun(int grid[][],int k,int i,int j,int temp, Integer[][][] mem)
    {
        int sum=temp;
        if(i==grid.length || j==grid[0].length) return 0;
        temp=(temp+grid[i][j])%k;
        if(i==grid.length-1 && j==grid[0].length-1){
            if(temp==0) return 1;
            else return 0;
        }
        if (mem[i][j][sum] != null) return mem[i][j][sum];
        return  mem[i][j][sum] =(fun(grid,k,i+1,j,temp,mem)+fun(grid,k,i,j+1,temp,mem))%MOD;
    }
    public int numberOfPaths(int[][] grid, int k) {
         Integer[][][] mem = new Integer[grid.length][grid[0].length][k];
    
        return fun(grid,k,0,0,0,mem);
    }
}