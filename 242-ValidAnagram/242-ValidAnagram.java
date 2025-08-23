// Last updated: 8/23/2025, 10:29:24 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int c[]=new int [26];
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl)
        {
            return false;
        }
        if(s.equals(t))
        {
            return true;
        }
        for(int i=0;i<sl;i++)
        {
            c[s.charAt(i)-97]++;
        }
        for(int i=0;i<tl;i++)
        {
            c[t.charAt(i)-97]--;
            if(c[t.charAt(i)-97]<0)
            {
                return false;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(c[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}