// Last updated: 8/23/2025, 10:28:49 PM
class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1],b[1]));
        int ans=1;
        int et=arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]>=et)
            {
                et=arr[i][1];
                ans++;
            }
        }
        return arr.length-ans;
    }
}