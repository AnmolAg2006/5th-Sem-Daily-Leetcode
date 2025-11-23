// Last updated: 11/23/2025, 8:04:15 AM
class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        long sum=0;
        int j=0;
        while(n!=0)
            {
                long rem=n%10;
                n/=10;
                sum+=rem;
                if(rem==0) continue;
                ans=(long)Math.pow(10,j++)*rem+ans;
                
            }
        return ans*sum;
    }
}