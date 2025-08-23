// Last updated: 8/23/2025, 10:24:24 PM
class Solution {
    public String clearDigits(String s) {
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}