// Last updated: 8/23/2025, 10:26:42 PM
class Solution {
    public static int isValid(String words,int c[])
    {
        
            for(int j=0;j<words.length();j++)
            {
                if(c[words.charAt(j)-'a']==0)
                {
                    return 0;
                }
            }

        return 1;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int c[]=new int[26];
        for(int i=0;i<allowed.length();i++)
        {
            c[allowed.charAt(i)-'a']++;
        }
        int c1=0;
        for(int i=0;i<words.length;i++)
        {
            
            c1+=isValid(words[i],c);
        }
        return c1;
    }
}