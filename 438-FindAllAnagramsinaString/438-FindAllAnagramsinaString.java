// Last updated: 10/2/2025, 11:46:38 AM
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
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        if (s.length() < p.length()) return ans;
        int sf[]=new int[26];
        int pf[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pf[p.charAt(i)-'a']++;
            sf[s.charAt(i)-'a']++;
        }
        if(isValid(pf,sf))
        {
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
            sf[s.charAt(i)-'a']++;
            sf[s.charAt(i-p.length())-'a']--;
            if(isValid(pf,sf))
            {
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}