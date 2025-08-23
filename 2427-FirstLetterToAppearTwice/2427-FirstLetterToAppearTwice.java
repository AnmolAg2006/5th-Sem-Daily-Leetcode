// Last updated: 8/23/2025, 10:25:34 PM
class Solution {
    public char repeatedCharacter(String s) {
        int c[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-97]++;
            if(c[s.charAt(i)-97]==2)
            {
                return s.charAt(i);
            }
        }
        return 'd';
    }
}