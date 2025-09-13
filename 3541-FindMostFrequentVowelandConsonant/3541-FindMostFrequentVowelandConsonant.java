// Last updated: 9/13/2025, 3:03:38 PM
class Solution {
    public int maxFreqSum(String s) {
        int f[]=new int[26];
        int mv=0;
        int mc=0;
        for(char c:s.toCharArray())
        {
            f[c-'a']++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                mv=Math.max(mv,f[c-'a']);
            }
            else{
                mc=Math.max(mc,f[c-'a']);
            }
        }
        return mv+mc;
    }
}