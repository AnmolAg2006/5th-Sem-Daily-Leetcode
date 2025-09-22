// Last updated: 9/22/2025, 10:37:22 PM
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }
        return fun(s1,s2,0,0,dp);
    }
    public static int fun(String s1,String s2,int i,int j,int dp[][])
    {
        if(i==s1.length())
        {
            int sum=0;
            while(j<s2.length())
            {
                sum+=s2.charAt(j++);
            }
            return sum;
        }
        if(j==s2.length())
        {
            int sum=0;
            while(i<s1.length())
            {
                sum+=s1.charAt(i++);
            }
            return sum;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=fun(s1,s2,i+1,j+1,dp);
        }
        else{
            return dp[i][j]=Math.min(fun(s1,s2,i+1,j,dp)+(int)(s1.charAt(i)),fun(s1,s2,i,j+1,dp)+(int)s2.charAt(j));
        }
    }
}