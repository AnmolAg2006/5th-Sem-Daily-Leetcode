// Last updated: 8/23/2025, 10:25:46 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].startsWith(pref))
            {
                c++;
            }
        }
        return c;
    }
}