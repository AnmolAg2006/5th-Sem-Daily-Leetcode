// Last updated: 11/3/2025, 9:30:43 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans=0;
        int i=1;
        while(i<colors.length())
        {
            if(colors.charAt(i)==colors.charAt(i-1))
            {
                int max=0;
                while(i<neededTime.length && colors.charAt(i-1)==colors.charAt(i))
                {
                    ans+=neededTime[i-1];
                    max=Math.max(max,neededTime[i-1]);
                    i++;
                }
                ans+=neededTime[i-1];
                max=Math.max(max,neededTime[i-1]);
                if(max!=0) ans-=max;
            }
            i++;
        }
        return ans;
    }
}