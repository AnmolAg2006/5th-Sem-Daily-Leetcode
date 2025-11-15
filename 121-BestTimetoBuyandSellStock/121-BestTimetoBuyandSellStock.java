// Last updated: 11/15/2025, 7:43:01 PM
class Solution {
    public int maxProfit(int[] prices) {
        int l[]=new int[prices.length];
        int r[]=new int[prices.length];
        int n=prices.length;
        l[0]=prices[0];
        for(int i=1;i<n;i++)
        {
            l[i]=Math.min(prices[i],l[i-1]);
        }
        r[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            r[i]=Math.max(r[i+1],prices[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,r[i]-l[i]);
        }
        return ans;
    }
}