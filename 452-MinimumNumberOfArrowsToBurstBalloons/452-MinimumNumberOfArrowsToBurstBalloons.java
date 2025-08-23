// Last updated: 8/23/2025, 10:28:44 PM
class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));
        int ans=1;
        int et=arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]>et)
            {
                et=arr[i][1];
                ans++;
            }
        }
        return ans;
    }
}