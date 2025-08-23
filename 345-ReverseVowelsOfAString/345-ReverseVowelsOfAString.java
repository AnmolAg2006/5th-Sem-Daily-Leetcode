// Last updated: 8/23/2025, 10:29:09 PM
class Solution {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // This handles uppercase letters
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public String reverseVowels(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(isVowel(ch))
            {
                st.push(ch);
            }
        }
        for(char ch:s.toCharArray())
        {
            if(isVowel(ch))
            {
                ans.append(st.pop());
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}