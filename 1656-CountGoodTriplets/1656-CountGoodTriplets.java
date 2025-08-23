// Last updated: 8/23/2025, 10:26:53 PM
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(Math.abs(arr[j]-arr[i])<=a)
                {
                    for(int k=j+1;k<arr.length;k++)
                    {
                        if(Math.abs(arr[k]-arr[j])<=b && Math.abs(arr[k]-arr[i])<=c)
                        {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}