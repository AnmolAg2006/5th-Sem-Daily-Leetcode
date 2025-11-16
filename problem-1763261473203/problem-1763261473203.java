// Last updated: 11/16/2025, 8:21:13 AM
class Solution {
    public long countDistinct(long n) {
        String s=String.valueOf(n);
        int k=s.length();
        long ans=0;

        long p=1;
        for(int j=1;j<k;j++)
            {
               p*=9;
                ans+=p;
            }
        for(int i=0;i<k;i++)
        {
            int d=s.charAt(i)-'0';
            if(d==0)
            {
                break;
            }
            long po=1;
            for(int j=0;j<k-i-1;j++)
            {
                po*=9;
            }
            ans+=(long)(d-1)*po;
            if(i==k-1) ans+=1;
        }
        return ans;
    }
}