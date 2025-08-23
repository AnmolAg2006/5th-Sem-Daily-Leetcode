// Last updated: 8/23/2025, 10:28:28 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        String words[]=s.split("\\s+");
        for(String word:words)
        {
           StringBuilder reversed=new StringBuilder(word);
           reversed.reverse();
           str.append(reversed+" ");
        }
        return str.toString().trim();
    }
}