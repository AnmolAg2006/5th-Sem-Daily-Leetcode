// Last updated: 9/2/2025, 6:05:33 PM
class Solution {
    public String removeOuterParentheses(String s) {
        // s = "(()())(())(()(()))"
        // ans="()()()()(())"
        StringBuilder ans=new StringBuilder();
        Stack <Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(') {
                st.push(i);
            } else {
                if(st.size()==1) {
                    ans.append(s.substring(st.pop()+1,i));
                } else {
                    st.pop();
                }
            }
        }
        return ans.toString();
    }
}