// Last updated: 8/23/2025, 10:27:23 PM
class Solution {
    public String greatestLetter(String s) {
        int c[]=new int [123];
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)]++;
        }
        for(int i=90;i>=65;i--)
        {
            if(c[i]!=0 && c[i+32]!=0)
            {
                ans+=(char)(i);
                return ans;
            }
        }
        return ans;
    }
}