// Last updated: 8/23/2025, 10:29:58 PM
class Solution {
    public boolean isPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                ans+=s.charAt(i);
            }

        }
        ans=ans.toLowerCase();
        int l=ans.length();
        for(int i=0;i<l/2;i++)
        {
            if(ans.charAt(i)!=ans.charAt(l-1-i))
            {
                return false;
            }
        }
        System.out.print(ans);
        return true;
    }
}