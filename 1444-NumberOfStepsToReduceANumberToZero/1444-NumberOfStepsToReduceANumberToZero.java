// Last updated: 8/23/2025, 10:27:17 PM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0)
        {
            num=(num%2==0)?(num/2):(num-1);
            c++;
        }
        return c;

    }
}