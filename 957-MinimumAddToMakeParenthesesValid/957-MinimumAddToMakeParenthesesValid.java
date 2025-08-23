// Last updated: 8/23/2025, 10:27:45 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()=='(' && c==')')
            {
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.size();
    }
}