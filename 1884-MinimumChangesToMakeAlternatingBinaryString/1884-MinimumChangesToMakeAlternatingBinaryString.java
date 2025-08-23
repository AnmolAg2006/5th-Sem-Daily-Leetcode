// Last updated: 8/23/2025, 10:26:32 PM
class Solution {
    public int minOperations(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0 && s.charAt(i)!='0')
            {
                c++;
            }
            else if(i%2!=0 && s.charAt(i)!='1')
            {
                c++;
            }
        }
        return Math.min(c,s.length()-c);
    }
}