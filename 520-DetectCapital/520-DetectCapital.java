// Last updated: 8/23/2025, 10:28:34 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int l=0;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)>=97 && word.charAt(i)<=122)
            {
                l++;   
            }
        }
        return l==word.length()||l==word.length()-1 || l==0 && word.charAt(0)<97;
    }
}