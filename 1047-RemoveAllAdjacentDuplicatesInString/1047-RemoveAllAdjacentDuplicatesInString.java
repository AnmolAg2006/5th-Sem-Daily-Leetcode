// Last updated: 9/21/2025, 10:12:49 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(!st.isEmpty() && st.peek()==s.charAt(i))
            {
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            i++;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.pop());

        }
        ans.reverse();
        return ans.toString();
    }
}