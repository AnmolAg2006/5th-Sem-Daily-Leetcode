// Last updated: 10/26/2025, 10:55:44 PM
class Solution {
    public int minSteps(String s, String t) {
        int f[]=new int[26];
        for(char c:s.toCharArray())
        {
            f[c-'a']++;
        }
        
        for(char c:t.toCharArray())
        {
            f[c-'a']--;
        }
        int ans=0;
        for(int i=0;i<26;i++)
        {
            ans+=Math.abs(f[i]);
        }
        return ans;
    }
}