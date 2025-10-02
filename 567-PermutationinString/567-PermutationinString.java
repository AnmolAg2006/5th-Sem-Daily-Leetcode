// Last updated: 10/2/2025, 11:51:07 AM
class Solution {
    public static boolean isValid(int pf[],int sf[])
    {
        for(int i=0;i<26;i++)
        {
            if(pf[i]!=sf[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String p, String s) {
        if (s.length() < p.length()) return false;
        int sf[]=new int[26];
        int pf[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pf[p.charAt(i)-'a']++;
            sf[s.charAt(i)-'a']++;
        }
        if(isValid(pf,sf)) return true;
        for(int i=p.length();i<s.length();i++)
        {
            sf[s.charAt(i)-'a']++;
            sf[s.charAt(i-p.length())-'a']--;
            if(isValid(pf,sf))
            {
                return true;
            }
        }
        return false;
    }
}