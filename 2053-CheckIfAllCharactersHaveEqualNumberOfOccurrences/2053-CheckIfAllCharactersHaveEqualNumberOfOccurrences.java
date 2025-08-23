// Last updated: 8/23/2025, 10:26:16 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int c[]=new int[26];
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            f=++c[s.charAt(i)-'a'];
        }
        for(int i=0;i<26;i++)
        {
            if(c[i]!=0 && c[i]!=f)
            {
                System.out.print(f);
                return false;
            }
        }
        return true;
    }
}