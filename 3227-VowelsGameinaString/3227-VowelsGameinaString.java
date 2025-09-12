// Last updated: 9/12/2025, 9:15:57 PM
class Solution {
    public boolean doesAliceWin(String s) {
        int c=0;
        for(char ch:s.toCharArray())
        {
            if("aeiou".indexOf(ch)!=-1)
            {
                c++;
            }
        }
        if(c==0)
        {
            return false;
        }
            return true;
        
    }
}