// Last updated: 8/23/2025, 10:27:46 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if((c>=65 && c<=90 )|| (c>=97 && c<=122))
            {
                st.push(c);
            }

        }
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if((c>=65 && c<=90 )|| (c>=97 && c<=122))
            {
                ans.append(st.pop());
            }
            else
            {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}