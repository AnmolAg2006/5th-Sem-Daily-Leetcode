// Last updated: 8/23/2025, 10:25:21 PM
class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(j<t.length() && i<s.length())
        {
            if(t.charAt(j)==s.charAt(i))
            {
                j++;
            }
            i++;
        }
        return t.length()-j;
    }
}