// Last updated: 8/23/2025, 10:26:39 PM
class Solution {
    public String interpret(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' && s.charAt(i+1)==')')
            {
                ans.append("o");
                i++;
            }
            else if(s.charAt(i)=='G')
            {
                ans.append("G");
            }
            else{
                ans.append("al");
                i+=3;
            }
        }
        return ans.toString();

    }
}