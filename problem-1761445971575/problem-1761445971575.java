// Last updated: 10/26/2025, 8:02:51 AM
class Solution {
    public long removeZeros(long n) {
        long ans=0;
        int j=0;
        while(n!=0)
            {
                long rem=n%10;
                n/=10;
                if(rem==0)
                {
                    continue;
                    
                } else{
                    ans=(long)Math.pow(10,j)*rem+ans;
                    j++;
                }
            }
        return ans;
    }
}