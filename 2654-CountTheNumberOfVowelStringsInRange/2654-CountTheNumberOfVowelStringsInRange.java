// Last updated: 8/23/2025, 10:25:12 PM
class Solution {
    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
        {
            return true;
        }
        return false;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1) ))
            {
                c++;
            }
        }
        return c;
    }
}