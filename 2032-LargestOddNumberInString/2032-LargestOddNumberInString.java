// Last updated: 8/23/2025, 10:26:18 PM
class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        for(int i=num.length()-1;i>=0;i--)
        {
            char c=num.charAt(i);
            if(c=='9'||c=='7'||c=='5'||c=='3'||c=='1')
            {
                ans+=num.substring(0,i+1);
                break;
            }
        }
        return ans;
    }
}