// Last updated: 9/6/2025, 2:55:39 PM
class Solution {
    public static boolean fun(String s,int i,int j,int c)
    {
        if(i>=j) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)) {
            if(c==1)
            {
                return false;
            }
            return fun(s,i+1,j,c+1)||fun(s,i,j-1,c+1);
        }
        return fun(s,i+1,j-1,c);
    }
    public boolean validPalindrome(String s) {
        return fun(s,0,s.length()-1,0);
    }
}