// Last updated: 8/23/2025, 10:24:39 PM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int nums[]= new int[2];
        int sum=0;
        int arr[]= new int[grid.length*grid[0].length+1];
        int n = grid.length*grid[0].length;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                     sum+=grid[i][j];
                arr[grid[i][j]]++;
                if(arr[grid[i][j]]==2){
                     nums[0]=grid[i][j];
                }
            }
        }
        nums[1]=nums[0]+(n*(n+1))/2-sum;
        return nums;
        
    }
}