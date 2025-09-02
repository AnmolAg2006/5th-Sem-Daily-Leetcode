// Last updated: 9/2/2025, 5:40:17 PM
class Solution {
    public String largestOddNumber(String num) {
        int j=-1;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)%2!=0)
            {
                j=i;
                break;
            }
        }
        return num.substring(0,j+1);
    }
}