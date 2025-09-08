// Last updated: 9/8/2025, 10:13:51 AM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                
                ans.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        for(int i=0;i<ans.length()/2;i++)
        {
            if(ans.charAt(i)!=ans.charAt(ans.length()-i-1)){
                return false;
            }
        }
        System.out.print(ans.toString());
        return true;
    }
}