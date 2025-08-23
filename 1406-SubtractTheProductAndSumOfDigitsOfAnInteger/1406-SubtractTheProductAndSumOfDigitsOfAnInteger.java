// Last updated: 8/23/2025, 10:27:21 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n!=0)
        {
            int rem=n%10;
            n/=10;
            sum+=rem;
            prod*=rem;
        }
        return prod-sum;
    }
}