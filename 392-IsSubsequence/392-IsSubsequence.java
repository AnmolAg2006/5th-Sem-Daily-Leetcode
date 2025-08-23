// Last updated: 8/23/2025, 10:28:56 PM
class Solution {
    public boolean isSubsequence(String s, String t) {

        int tl=t.length();
        int sl=s.length();
        // if(sl>tl)
        // {
        //     return false;
        // }
        if(sl==0)
        {
            return true;
        }
        int k=0;
        for(int i=0;i<tl;i++)
        {
            if(t.charAt(i)==s.charAt(k))
            {
                k++;
            }
        if(k==sl)
        {
            return true;
        }
        }
        return false;
    }
}