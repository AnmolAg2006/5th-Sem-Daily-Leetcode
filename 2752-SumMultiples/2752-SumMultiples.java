// Last updated: 8/23/2025, 10:25:03 PM
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=3;i<=n;i++)
        {
            if(i%3==0)
            {
                sum+=i;
            }
            else if(i%5==0)
            {
                sum+=i;
            }
            else if(i%7==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}