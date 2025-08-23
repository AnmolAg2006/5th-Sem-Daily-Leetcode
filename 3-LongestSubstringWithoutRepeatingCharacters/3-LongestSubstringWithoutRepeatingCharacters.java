// Last updated: 8/23/2025, 10:30:51 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs=new HashSet<>();
        int st=0,ans=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(hs.contains(c)) {
                while(hs.contains(c))
                {
                    hs.remove(s.charAt(st++));
                }
                // st=i-1;
            } else {
                ans=Math.max(ans,i-st+1);
            }
            hs.add(c);
        }
        return ans;
    }
}