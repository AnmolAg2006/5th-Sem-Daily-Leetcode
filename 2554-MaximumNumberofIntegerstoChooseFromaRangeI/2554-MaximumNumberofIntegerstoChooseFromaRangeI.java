// Last updated: 10/22/2025, 1:08:43 AM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:banned)
        {
            if(i<=n)
            {
                hs.add(i);
            }
        }
        int ans=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(!hs.contains(i) && sum+i<=maxSum)
            {
                sum+=i;
                ans++;
            }
            if(sum>=maxSum)
            {
                return ans;
            }
        }
        return ans;
    }
}