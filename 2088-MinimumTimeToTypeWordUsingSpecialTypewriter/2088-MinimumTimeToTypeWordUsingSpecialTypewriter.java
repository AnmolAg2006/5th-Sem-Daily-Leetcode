// Last updated: 8/23/2025, 10:26:13 PM
class Solution {
    public int minTimeToType(String word) {
        char curr='a';
        int ans=0;
        for(char c:word.toCharArray())
        {
            ans+=Math.min(Math.abs(c-curr),26-Math.abs(c-curr))+1;
            curr=c;
        }
        return ans;
    }
}