// Last updated: 8/23/2025, 10:29:22 PM
class Solution {
    public int addDigits(int num) {
        while(num/10!=0)
        {
            int ans=0;
            while(num!=0)
            {
                int temp=num%10;
                ans+=temp;
                num/=10;
            }
            num=ans;
        }
        return num;
    }
}