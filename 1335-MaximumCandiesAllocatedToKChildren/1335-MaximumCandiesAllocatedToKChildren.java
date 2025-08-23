// Last updated: 8/23/2025, 10:27:26 PM
class Solution {
    public static boolean isItPossible(int candies[],long k,int mid)
    {
        long c=0;
        for(int i=0;i<candies.length;i++)
        {
            c+=candies[i]/mid;
        }
        return c>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        int ei=0;
        for(int i=0;i<candies.length;i++)
        {
            ei=Math.max(ei,candies[i]);
        }
        int si=1;
        int ans=0;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            if(isItPossible(candies,k,mid))
            {
                ans=mid;
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return ans;
    }
}