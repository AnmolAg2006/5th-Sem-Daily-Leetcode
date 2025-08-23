// Last updated: 8/23/2025, 10:28:55 PM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(char c:hm.keySet())
        {
            ans+=hm.get(c)/2*2;
        }
        if(ans!=s.length())
        {
            return ans+1;
        }
        return ans;
    }
}