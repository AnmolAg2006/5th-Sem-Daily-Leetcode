// Last updated: 8/23/2025, 10:27:09 PM
class Solution {
    public int n1(String s,int n)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                c++;
            }
        }
        return c;
    }
    public int n0(String s,int n)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
            {
                c++;
            }
        }
        return c;
    }
    public int maxScore(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            int c=0;
            c=n0(s.substring(0,i),i)+n1(s.substring(i,n),n-i);
            max=Math.max(max,c);
        }
        return max;
    }
}