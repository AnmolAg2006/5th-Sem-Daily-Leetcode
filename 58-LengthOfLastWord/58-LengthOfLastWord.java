// Last updated: 8/23/2025, 10:30:24 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        s=s.trim();
        for(int i=s.length()-1;i>-1;i--)
        {
            if(s.charAt(i)==' ')
            {
                return c;
            }
            else{
                c++;
            }

        }
        return s.length();
    }
}