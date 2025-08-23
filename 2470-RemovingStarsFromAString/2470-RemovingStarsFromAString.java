// Last updated: 8/23/2025, 10:25:31 PM
class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                str.deleteCharAt(str.length() - 1);
                continue;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}