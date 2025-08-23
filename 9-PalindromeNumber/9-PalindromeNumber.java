// Last updated: 8/23/2025, 10:30:50 PM
class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0)
        // {
        //     return false;
        // }
        String s= String.valueOf(x);
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;

            }

        }
        return true;
    }
}