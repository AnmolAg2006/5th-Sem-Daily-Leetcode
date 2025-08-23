// Last updated: 8/23/2025, 10:30:41 PM
class Solution {
    public int strStr(String haystack, String needle) {
        String s1=haystack;
        String s2=needle;
        int l1=s1.length();
        int l2=s2.length();
        for(int i=0;i<l1-l2+1;i++)
        {
            int c=0;
            for(int j=0;j<l2;j++)
            {
                if(s1.charAt(i+j)!=s2.charAt(j))
                {
                    break;
                }
                else{
                    c++;
                }
            }
            if(c==l2)
            {
                return i;
            }
        }
        return -1;
    }
}