// Last updated: 8/23/2025, 10:26:29 PM
class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int smax=-2;
        for(int i=0;i<s.length();i++)
        {
            int a=s.charAt(i)-48;
            if(a>=0 && a<10)
            {
                if(a>max)
                {
                    smax=max;
                    max=a;
                }
                else if(a<max && a>smax)
                {
                    smax=a;
                }
            }
        }
        if(smax==-2)
        {
            return -1;
        }
        return smax;
    }
}