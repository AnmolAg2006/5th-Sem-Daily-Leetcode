// Last updated: 8/23/2025, 10:26:40 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int arr[]=new int [accounts.length];
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            int c=0;
            for(int j=0;j<accounts[0].length;j++)
            {

                c+=accounts[i][j];
            }
            max=Math.max(max,c);
        }
        return max;
    }
}