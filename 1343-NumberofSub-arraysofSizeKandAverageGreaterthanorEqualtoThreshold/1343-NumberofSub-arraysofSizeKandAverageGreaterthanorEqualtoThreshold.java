// Last updated: 11/21/2025, 7:24:23 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int ans=(sum/k>=t)?1:0;
        for(int i=k;i<n;i++)
        {
            sum-=arr[i-k];
            sum+=arr[i];
            if(sum/k>=t) ans++;
        }
        return ans;
    }
}