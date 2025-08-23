// Last updated: 8/23/2025, 10:24:35 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int rev=x;
        int sum=0;
        while(x!=0)
        {
            int r=x%10;
            x/=10;
            sum+=r;
        }
        return (rev%sum==0)?sum:-1;
    }
}