// Last updated: 9/21/2025, 6:15:11 PM
class Solution {
    public int minChanges(String s) {
        int c=0;
        // if(s.length()%2!=0) 
        // {
        //     return false;
        // }
        for(int i=0;i<s.length();i+=2)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                c++;
            }
        }
        return c;
    }
}