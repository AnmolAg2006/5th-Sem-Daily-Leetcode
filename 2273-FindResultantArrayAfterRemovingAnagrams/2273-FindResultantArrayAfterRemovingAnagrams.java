// Last updated: 10/13/2025, 12:06:06 PM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(ans.size()==0 || !isValid(words[i],ans.get(ans.size()-1)))
            {
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public static boolean isValid(String s1,String s2)
    {
        int c[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            c[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            c[s2.charAt(i)-'a']--;
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