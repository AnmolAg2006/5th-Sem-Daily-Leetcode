// Last updated: 8/23/2025, 10:26:12 PM
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String res="";
        for(String s1:words)
        {
            res+=s1;
            if(res.length()>s.length()) return false;
            if(s.equals(res)) return true;
        }
        return false;
    }
}