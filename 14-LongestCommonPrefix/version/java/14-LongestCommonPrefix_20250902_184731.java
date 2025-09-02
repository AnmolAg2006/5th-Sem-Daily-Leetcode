// Last updated: 9/2/2025, 6:47:31 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        String prefix="";
        int i=0;
        for(;i<Math.min(s1.length(),s2.length());i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                break;
            }
            
        }
        return s1.substring(0,i);
    }
}