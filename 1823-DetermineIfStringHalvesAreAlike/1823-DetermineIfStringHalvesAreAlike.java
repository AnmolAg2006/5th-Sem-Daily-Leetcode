// Last updated: 8/23/2025, 10:26:36 PM
class Solution {
    public static boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public boolean halvesAreAlike(String s) {
        int c=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(isVowel(s.charAt(i))) c++;
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(isVowel(s.charAt(i))) c--;
        }
        return c==0;
    }
}