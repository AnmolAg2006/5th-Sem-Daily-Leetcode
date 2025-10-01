// Last updated: 10/1/2025, 11:22:51 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs=new HashSet<>();
        int n=s.length();
        int st=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(hs.contains(ch))
            {
                
                while(hs.contains(ch))
                {
                    hs.remove(s.charAt(st++));
                }
                
            } else {
                ans=Math.max(ans,i-st+1);
            }
            hs.add(ch);
        }
        return ans;
    }
}