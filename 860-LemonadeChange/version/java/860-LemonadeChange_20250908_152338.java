// Last updated: 9/8/2025, 3:23:38 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        for(int i:bills) {
            if(i==5)
            {
                f++;
            }
            else if(i==10)
            {
                if(f==0)
                {
                    return false;
                }
                f--;
                t++;
            }
            else{
                if(t==0) {
                    if(f<3)
                    {
                        return false;
                    }
                    else {
                        f=f-3;
                    }
                }
                else{
                    t--;
                    if(f==0)
                    {
                        return false;
                    }
                    f--;
                }
            }
        }
        return true;
    }
}