// Last updated: 8/23/2025, 10:25:20 PM
class Solution {
    public int countDigits(int num) {
        int n=num;
        int c=0;
        while(num!=0)
        {
            int temp=num%10;
            if(n%temp==0)
            {
                c++;
            }
            num/=10;
        }
        return c;
    }
}