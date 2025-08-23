// Last updated: 8/23/2025, 10:27:03 PM
class Solution {
    public static int val(int i,int []prices)
    {
        for(int j=i+1;j<prices.length;j++)
        {
            if(prices[i]>=prices[j])
            {
                return prices[i]-prices[j];
            }
        }
        return prices[i];
    }
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int answer[]=new int[n];
        for(int i=0;i<n;i++)
        {
            answer[i]=val(i,prices);
        }
        return answer;
    }
}