// Last updated: 8/23/2025, 10:29:49 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int l=s.length();
        String ans="";
        int idx=l;
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' && idx!=i+1)
            {
                ans+=s.substring(i+1,idx)+" ";
                idx=i;
            }
            else if(s.charAt(i)==' ' && idx==i+1)
            {
                idx=i;
            }
        }
        return ans+s.substring(0,idx);
    }
}