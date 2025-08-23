// Last updated: 8/23/2025, 10:25:56 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0)
        {
            return true;
        }
        while(num!=0)
        {
            if(num%10==0)
            {
                return false;
            }
            if(num%10!=0)
            {
                return true;    
            }
            num/=10;
        }
        return true;
    }
}