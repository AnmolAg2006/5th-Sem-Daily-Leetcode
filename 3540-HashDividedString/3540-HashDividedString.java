// Last updated: 8/23/2025, 10:24:15 PM
class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans=new StringBuilder();
        int j=0;
        int c=0;
        int i=0;
        while(i<s.length())
        {
            c+=s.charAt(i)-'a';
            if(++i%k==0)
            {
                ans.append((char)('a'+(c%26)));
                c=0;
            }
        }
        return ans.toString();
    }
}