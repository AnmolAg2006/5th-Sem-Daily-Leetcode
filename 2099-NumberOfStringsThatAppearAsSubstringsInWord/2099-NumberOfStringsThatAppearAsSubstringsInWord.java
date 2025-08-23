// Last updated: 8/23/2025, 10:26:11 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for(String s:patterns)
        {
            if(word.contains(s))
            {
                ans++;
            }
        }
        return ans;
    }
}