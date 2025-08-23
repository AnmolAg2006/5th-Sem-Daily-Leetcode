// Last updated: 8/23/2025, 10:29:15 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0)
        {
            return false;
        }

        else{
            int k=0;
            for(int i=0;n!=1;i++)
            {
                k+=n%3;
                n/=3;
                if(k!=0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}