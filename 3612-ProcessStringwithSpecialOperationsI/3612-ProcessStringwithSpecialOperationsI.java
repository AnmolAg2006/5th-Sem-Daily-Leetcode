// Last updated: 9/16/2025, 10:50:25 PM
class Solution {
    public String processStr(String s) {
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c=='*')
            {
                if(ans.length()>0)
                {
                    ans.deleteCharAt(ans.length()-1);
                }
            }
            else if(c=='#')
            {
                ans.append(ans.toString());
            } else if(c=='%')
            {
                ans.reverse();
            } else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}